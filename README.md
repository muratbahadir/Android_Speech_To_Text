# Android_Speech_To_Text
Mobiler.dev platformunda "Android Uygulamalarında Sesten Yazıya Çevirme" başlıklı yazımda anlattığım örnek proje.

Yazı Linki: https://www.mobiler.dev/post/google-speech-to-text-api

Uygulama başlatıldığında çıkan ilk ekranda hangi yöntemle ses tanıma yapmak istediğinizi seçebilirsiniz.
Google Pop-Up ile tanıma yapmak istediğinizde açılan ekrandaki butona basmanız ve konuşmanız yeterli olacaktır.
Konuştuğunuzda okunan ses verileri eş zamanlı olarak açılan pencerede gözükür. Aynı zamanda uygulamanın ses duyamadığı an dinlemeyi bırakır ve ekrandaki Text View'da son söyledikleriniz görünür.

Pop-Up olmadan butonuna tıkladığınızda yine başla butonuna tıklayarak kaydı başlatabilirsiniz. Diğerine kıyasla tek fark bunda sadece ses kaydının başladığına dair bir uyarı mesajı verilir.
Uygulama ses alamadığında veya siz "BİTİR" butonuna tıkladığınızda kayıt durur ve sonuçlar TextView üzerinde gösterilir.

İki yöntemde de Google Speech To Text API kullanılıyor ve  "Google" uygulamasının telefonunuzda yüklü olması gerekiyor.
