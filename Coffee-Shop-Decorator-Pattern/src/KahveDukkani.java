interface Kahve {
    String getTanım();
    double getMaliyet();
}

class TemelKahve implements Kahve {
    @Override
    public String getTanım() {
        return "Temel Kahve";
    }

    @Override
    public double getMaliyet() {
        return 5.0;
    }
}

abstract class KahveDekoratör implements Kahve {
    protected Kahve süslenmişKahve;

    public KahveDekoratör(Kahve kahve) {
        this.süslenmişKahve = kahve;
    }

    @Override
    public String getTanım() {
        return süslenmişKahve.getTanım();
    }

    @Override
    public double getMaliyet() {
        return süslenmişKahve.getMaliyet();
    }
}

class SutDekoratör extends KahveDekoratör {
    public SutDekoratör(Kahve kahve) {
        super(kahve);
    }

    @Override
    public String getTanım() {
        return süslenmişKahve.getTanım() + ", Süt";
    }

    @Override
    public double getMaliyet() {
        return süslenmişKahve.getMaliyet() + 1.5;
    }
}

class CikolataDekoratör extends KahveDekoratör {
    public CikolataDekoratör(Kahve kahve) {
        super(kahve);
    }

    @Override
    public String getTanım() {
        return süslenmişKahve.getTanım() + ", Çikolata";
    }

    @Override
    public double getMaliyet() {
        return süslenmişKahve.getMaliyet() + 2.0;
    }
}

public class KahveDukkani {
    public static void main(String[] args) {
        Kahve kahve = new TemelKahve();
        System.out.println(kahve.getTanım() + " Fiyat: ₺" + kahve.getMaliyet());

        kahve = new SutDekoratör(kahve);
        System.out.println(kahve.getTanım() + " Fiyat: ₺" + kahve.getMaliyet());

        kahve = new CikolataDekoratör(kahve);
        System.out.println(kahve.getTanım() + " Fiyat: ₺" + kahve.getMaliyet());
    }
}
