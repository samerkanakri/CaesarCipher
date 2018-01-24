# Caesar Cipher Encryption/Decryption Algorithm

<h3>About</h3>
<p>I wrote this code during my freshman year back in 2013, after reading the book <b>Hacking Secret Ciphers with Python</b> by <b>Al Sweigart</b>.<br>
This utility implements the <b>Caesar Shift Algorithm</b> which is named after <b>Julius Caesar</b>, who used it in his private correspondence.</p>

<h3>How is this helpful?</h3>
<ul>
    <li>It would be helpful for anyone wants to learn how a basic encryption algorithm works.</li>
    <li>a good example for working with strings in java.</li>
</ul>

<h3>IDE</h3>
<p>This project was implemented on IntelliJ IDEA.</p>

<h3>Pseudo code</h3>

    Eevery letter in alphabet has an index number ,
    In case of Encryption
           - find out each letter's index number in the Plaintext ..
             then add the encryption key to it ,
           - if index + encryption key > 26 (which is alphabet length)..
             subtract 26 from the Final Index..
           - the final Finaltxt is the index we need
             this index reffers to a new letter..
             this letter is the encrypted form of the plaintext
             we call it ciphertext.
    In case of Decryption
           - find out each letter's index number in the siphertext ..
             then subtract the encryption key from it ,
           - if index - encryption key < 0 ..
             add 26 to the Final Index..
           - the final Finaltxt is index we need
             this index refers to a new letter..
             this letter is the encrypted form of the plaintext
             we call it ciphertext.

<h3>Android App</h3>
<p>As a demo for this code you may check my <a href="https://play.google.com/store/apps/details?id=com.sam.amman.theencryptionapp">android app on Play Store</a> which implements Caesar Cipher Algorithm for encrypting and decrypting texts.</p>
