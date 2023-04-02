# Project 19 - Breaking Tiny ECC  

Suppose Alice and Bob have agreed to use $y^2 = x^3 − 17x + 31$, $p = 52981$, and $P = (107, 391)$. They exchange their public keys $mP$ and $nP$, but your agents sadly are unable to see those points. Later Alice sends the encrypted message $77066213$ to Bob, using their shared secret to encrypt her original plain-text message. Bob gets sloppy and leaves a piece of paper in plain sight on his desk, which your secret agent sees, reporting to you that Bob wrote down $fl$ followed by two more symbols that couldn’t be read.  

You know all this information, and suspect that Alice and Bob are using ECC, are using ```Encode``` and ```Decode```, and are using their shared secret (which is $mnP$) as follows: take the two least significant digits of $x$ and add them to the highest two digits of the encoded message, reducing mod 100. Then use the next 2 digits of $x$ to encrypt the next two digits of the encoded message. Then use the two least significant digits of $y$ to encode the next two digits of the encoded message, and then the next two digits of $y$ to encode the last two digits of the encoded message. When Bob receives the encrypted message, he will decode the pairs of digits in the same way, but will subtract the digits of the shared secret number mod 100.  

For example, suppose the shared secret number were $(1296, 35142)$. To send the message help, Alice would first use ```Encode``` to get $73707781$. The encrypt/decrypt digits are $96$, $12$, $42$, and $51$, so Alice would compute  

$$
\begin{gather}
73 − 96 = −23 = 77, \\
70 − 12 = 58, \\
77 − 42 = 35, \\
81 − 51 = 30,
\end{gather}
$$

so she would send the message $77583530$.  

Bob would then add the corresponding pairs of digits of their shared secret, obtaining  

$$
\begin{gather}
77 + 96 = 173 = 73, \\
58 + 12 = 70, \\
35 + 42 = 77, \\
30 + 51 = 81
\end{gather}
$$

for a decrypted message $73707781$, which he would then ```Decode```, giving ```help```. Your job on this Project is to first figure out $m$ and $n$, use them to find $mnP$, and then figure out what message Alice sent.  

Hint: use the ```PointECC``` class.
