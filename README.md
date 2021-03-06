Summary

Your goal is to write a program that performs a simple encoding of a large volume of text. Try to make it easy for the reviewer to compile/execute your code.

 

Details

Part of your application is a set of 3 character transform functions. These transforms apply to a 4 row x 10 column section of keys on a standard qwerty keyboard.  The 4 rows start with 1, q, a, z and extend to 0, p, ;, /, respectively.

 

There are 3 types transforms that can be specified:

 

Horizontal Flip

This transformation will flip all rows of the keyboard horizontally (e.g., the 1 will swap with the 0, the 2 with the 9, etc.)

 

Vertical Flip

This transformation will flip all columns of the keyboard vertically (e.g., the 1 will swap with the z, the q with the a, the 2 with the x, etc.)

 

Shift

This transformation should take in an integer N and perform a linear shift of the keyboard.  Each key should shift N places to its right if N > 0 (and likewise to the left if N < 0).  If a key would move past its current row then it should shift into the row below, and so on.  So for example, for N = 5, the last five keys (nm,./ would move into the first 5 places of the top row, the 12345 would move 5 places to the right, 67890 would move to the start of the 2nd row, and so on). Likewise, left-shifting keys past their current rows would shift them back into the row above. Therefore, a single right and a left shift would produce the same keyboard.

 

The transforms can be chained.  For example, we might call your program and specify:

 

horizontal flip (H)

vertical flip (V)

horizontal flip (H)

shift by 5 (5)

vertical flip (V)

shift by -12 (-12)

 

The input for this would be H,V,H,5,V,-12

 

In that case, each transform would be applied to the output of the previous transform.  Horizontal flips are encoded by an H, vertical by a V, and shifts by an integer.

 

Inputs

  1.  String that specifies the transforms (e.g., H,V,H,5,V,-12)

 

Output

The program should print out the transformed text.

 

Additional Points

  1.  Some parts of the problem will be easier or harder depending on how you store the data.

  2.  Your program should be able to transform a huge volume of text efficiently.

  3.  You can assume that all input characters are lowercase.  If the input file contains unrecognized characters, they should go into the output unchanged.

  4.  Please write clean code.

 

Deliverables

  1.  The source code.

  2.  An extremely short readme file on how to run your program.

 

*Time = 2 hours (fine if you need a little longer): selesai/ tidak selesai jika sudah 2 jam mohon dikirimkan terlebih dahulu hasilnya, untuk revisi bisa menyusul, jika tidak mematuhi petunjuk, akan kami diskualifikasi

*Untuk data yang diproses static tidak apa-apa, jika dinamis lebih bagus lagi (menggunakan input dengan edit text)

*Untuk parameter proses, harus menggunakan input dari user (menggunakan edit text)

*Reply email ini dengan attachment android studio project yang dikerjakan (format .zip)

*Mohon mengerjakan dengan jujur

 

Start: 10:35 Finish: 12.35

 

Terima kasih.

