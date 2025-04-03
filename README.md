# Kahve Dükkanı - Dekoratör Deseni

Bu Java programı, **Dekoratör Tasarım Deseni**'ni kullanarak temel bir kahve üzerine ek malzemeler eklemeyi gösteriyor. Program, temel bir kahve (`TemelKahve`) oluşturur ve süt (`SutDekoratör`) ve çikolata (`CikolataDekoratör`) gibi özelleştirilmiş malzemeler ekleyerek her ekleme ile kahvenin açıklamasını ve maliyetini günceller.

## Nasıl Çalışır:
1. **Kahve**: Kahve sınıfının temel arayüzüdür. Kahvenin açıklamasını (`getTanım()`) ve maliyetini (`getMaliyet()`) alır.
2. **TemelKahve**: Basit bir kahve sınıfıdır.
3. **KahveDekoratör**: Dekoratör tasarım deseninde, `Kahve` arayüzünü implement eden ve bir `Kahve` nesnesini alarak işlevselliğini genişleten soyut bir sınıftır.
4. **SutDekoratör**: Kahveye süt ekleyen dekoratördür.
5. **CikolataDekoratör**: Kahveye çikolata ekleyen dekoratördür.

## Kullanım:
- Temel bir kahve oluşturup, üzerine sırasıyla malzemeler ekleyebilirsiniz. Eklenen malzemelerle kahvenin maliyeti ve açıklaması dinamik bir şekilde güncellenir.

