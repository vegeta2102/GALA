1. Show full text without crop in Column.paint
contentScale = ContentScale.Crop

2. Note when create new webp image
我々はwebpのようなラスター画像をリソースとして用意するときに、drawable-xxhdpi サイズ１つに対して画像を用意しています。
なので、プロジェクト側で用意する場合は、ほかと同様にdrawable-xxhdpi １つに対して用意していただきたいです :pray:
ちなみに webp 画像の圧縮率には特に指定はなくて、鮮明に画像が見える状態であれば問題ないです
3. Get full log crash
   adb logcat --buffer=crash
4. java install command
   brew install openjdk@21
   The java version in mac should be same in Gradle setting Android Studio
5. 

plugins {
    id "com.android.application"
    id "kotlin-android"
}
For a library:
plugins {
    id "com.android.library"
    id "kotlin-android"
} 