object CaesarCipher {
  //encryption
  def encrypt(text: String, shift: Int): String = {
    text.map { c =>
      if (c.isLetter) {
        val base = if (c.isUpper) 'A' else 'a'
        ((c - base + shift) % 26 + base).toChar
      } else {
        c
      }
    }
  }

  //decryption
  def decrypt(text: String, shift: Int): String = {
    encrypt(text, 26 - shift)
  }

  def cipher(text: String, shift: Int, operation: (String, Int) => String): String = {
    operation(text, shift)
  }

  def main(args: Array[String]): Unit = {
    //sample
    val testText = "Hello, World!"
    val shift = 2

    val encryptedText = cipher(testText, shift, encrypt)
    println("Encrypted: " + encryptedText)

    val decryptedText = cipher(encryptedText, shift, decrypt)
    println("Decrypted: " + decryptedText)
  }
}
