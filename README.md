# Caesar Cipher Encryption/Decryption Algorithm

    Pseudo code:
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
