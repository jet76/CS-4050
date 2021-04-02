# Project 20 Breaking ECC by Social Hacking

Suppose Alice and Bob have agreed to use these values for exchanging encrypted information (following the published secp256k1 standard):
p = 115 792 089 237 316 195 423 570 985 008 687 907 853 269 984 665 640 564 039 457 584 007 908 834 671 663
a = 0
b = 7
P = ( 55 066 263 022 277 343 669 578 718 895 168 534 326 250 603 453 777 594 175 500 187 360 389 116 729 240 , 32 670 510 020 758 816 978 083 085 130 507 043 184 471 273 380 659 243 275 938 904 335 757 337 482 424 )

Alice is overheard in a restaurant somewhat pompously explaining that she has this great technique for making the computation of mP easier—she just uses for her secret number m a power of 2 plus a two-digit number, which makes the efficient algorithm even more efficient, because most of the work is doubling repeatedly to get up to the desired power of 2, with a little extra work to add on the small extra multiple of P. Alice sends to Bob, on an insecure communication channel as usual, her value for mP, namely
( 98 333 898 174 860 222 763 621 164 809 560 426 900 902 581 988 820 015 661 720 799 616 398 614 033 468 , 60 703 462 459 530 085 880 474 331 476 429 053 299 167 650 471 903 125 187 953 999 331 805 378 093 068 )

Your job on this Project (and please work alone on this Project, and do not share your answer with anyone) is to determine Alice’s secret number m.
Submit your work by email, stating Alice’s secret number m, attaching any code that you wrote/modified to get this value, and a brief description of your reasoning and process.
