{\rtf1\ansi\ansicpg949\cocoartf2639
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 Menlo-Regular;\f1\fnil\fcharset129 AppleSDGothicNeo-Regular;}
{\colortbl;\red255\green255\blue255;\red70\green137\blue204;\red23\green23\blue23;\red202\green202\blue202;
\red67\green192\blue160;\red140\green211\blue254;\red167\green197\blue152;\red194\green126\blue101;\red212\green214\blue154;
\red66\green179\blue255;\red183\green111\blue179;\red89\green138\blue67;}
{\*\expandedcolortbl;;\cssrgb\c33725\c61176\c83922;\cssrgb\c11765\c11765\c11765;\cssrgb\c83137\c83137\c83137;
\cssrgb\c30588\c78824\c69020;\cssrgb\c61176\c86275\c99608;\cssrgb\c70980\c80784\c65882;\cssrgb\c80784\c56863\c47059;\cssrgb\c86275\c86275\c66667;
\cssrgb\c30980\c75686\c100000;\cssrgb\c77255\c52549\c75294;\cssrgb\c41569\c60000\c33333;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs24 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 import\cf4 \strokec4  \cf5 \strokec5 javax\cf4 \strokec4 .\cf5 \strokec5 swing\cf4 \strokec4 .*;\cb1 \
\cf2 \cb3 \strokec2 import\cf4 \strokec4  \cf5 \strokec5 java\cf4 \strokec4 .\cf5 \strokec5 awt\cf4 \strokec4 .*;\cb1 \
\cf2 \cb3 \strokec2 import\cf4 \strokec4  \cf5 \strokec5 java\cf4 \strokec4 .\cf5 \strokec5 awt\cf4 \strokec4 .\cf5 \strokec5 event\cf4 \strokec4 .\cf5 \strokec5 ActionEvent\cf4 \strokec4 ;\cb1 \
\cf2 \cb3 \strokec2 import\cf4 \strokec4  \cf5 \strokec5 java\cf4 \strokec4 .\cf5 \strokec5 awt\cf4 \strokec4 .\cf5 \strokec5 event\cf4 \strokec4 .\cf5 \strokec5 ActionListener\cf4 \strokec4 ;\cb1 \
\
\cf2 \cb3 \strokec2 public\cf4 \strokec4  \cf2 \strokec2 class\cf4 \strokec4  \cf5 \strokec5 Calculator2\cf4 \strokec4  \cf2 \strokec2 extends\cf4 \strokec4  \cf5 \strokec5 JFrame\cf4 \strokec4  \{\cb1 \
\pard\pardeftab720\partightenfactor0
\cf4 \cb3     \cf2 \strokec2 static\cf4 \strokec4  \cf5 \strokec5 JLabel\cf4 \strokec4  \cf6 \strokec6 label\cf4 \strokec4 ;\cb1 \
\cb3     \cf2 \strokec2 static\cf4 \strokec4  \cf5 \strokec5 JLabel\cf4 \strokec4  \cf6 \strokec6 info\cf4 \strokec4 ;\cb1 \
\cb3     \cf5 \strokec5 double\cf4 \strokec4  \cf6 \strokec6 result\cf4 \strokec4  = \cf7 \strokec7 0\cf4 \strokec4 ;\cb1 \
\cb3     \cf5 \strokec5 String\cf4 \strokec4  \cf6 \strokec6 math\cf4 \strokec4  = \cf8 \strokec8 ""\cf4 \strokec4 ;\cb1 \
\cb3     \cf5 \strokec5 double\cf4 \strokec4  \cf6 \strokec6 num\cf4 \strokec4  = \cf7 \strokec7 0\cf4 \strokec4 ;\cb1 \
\cb3     \cf5 \strokec5 String\cf4 \strokec4  \cf6 \strokec6 tostring\cf4 \strokec4  = \cf8 \strokec8 ""\cf4 \strokec4 ;\cb1 \
\cb3     \cb1 \
\cb3     \cf2 \strokec2 public\cf4 \strokec4  \cf9 \strokec9 Calculator2\cf4 \strokec4 () \{\cb1 \
\cb3         \cf9 \strokec9 setTitle\cf4 \strokec4 (\cf8 \strokec8 "
\f1 \'b3\'bb\'b0\'a1
\f0  
\f1 \'b8\'b8\'b5\'e7
\f0  
\f1 \'b0\'e8\'bb\'ea
\f0  
\f1 \'b0\'e8\'bb\'ea\'b1\'e2
\f0 "\cf4 \strokec4 );\cb1 \
\cb3         \cf9 \strokec9 setDefaultCloseOperation\cf4 \strokec4 (\cf5 \strokec5 JFrame\cf4 \strokec4 .\cf10 \strokec10 EXIT_ON_CLOSE\cf4 \strokec4 );\cb1 \
\cb3         \cb1 \
\cb3         \cf5 \strokec5 Container\cf4 \strokec4  \cf6 \strokec6 MyCon\cf4 \strokec4  = \cf9 \strokec9 getContentPane\cf4 \strokec4 ();\cb1 \
\cb3         \cf6 \strokec6 MyCon\cf4 \strokec4 .\cf9 \strokec9 setLayout\cf4 \strokec4 (\cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 BorderLayout\cf4 \strokec4 (\cf7 \strokec7 5\cf4 \strokec4 , \cf7 \strokec7 5\cf4 \strokec4 ));\cb1 \
\cb3         \cf6 \strokec6 MyCon\cf4 \strokec4 .\cf9 \strokec9 setBackground\cf4 \strokec4 (\cf5 \strokec5 Color\cf4 \strokec4 .\cf10 \strokec10 LIGHT_GRAY\cf4 \strokec4 );\cb1 \
\cb3         \cb1 \
\cb3         \cf12 \strokec12 //
\f1 \'c0\'d4\'b7\'c2
\f0  
\f1 \'b0\'aa\'b0\'fa
\f0  
\f1 \'b0\'e1\'b0\'fa\'b0\'aa\'c0\'cc
\f0  
\f1 \'c3\'e2\'b7\'c2\'b5\'c7\'b4\'c2
\f0  
\f1 \'c0\'a7
\f0  
\f1 \'c6\'d0\'b3\'ce
\f0  
\f1 \'bb\'fd\'bc\'ba
\f0  
\f1 \'c8\'c4
\f0  
\f1 \'c4\'dc\'c5\'d7\'c0\'cc\'b3\'ca\'bf\'a1
\f0  
\f1 \'c3\'df\'b0\'a1
\f0 \cf4 \cb1 \strokec4 \
\cb3         \cf5 \strokec5 UpPanel\cf4 \strokec4  \cf6 \strokec6 UP\cf4 \strokec4  = \cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 UpPanel\cf4 \strokec4 ();\cb1 \
\cb3         \cf6 \strokec6 MyCon\cf4 \strokec4 .\cf9 \strokec9 add\cf4 \strokec4 (\cf6 \strokec6 UP\cf4 \strokec4 , \cf5 \strokec5 BorderLayout\cf4 \strokec4 .\cf10 \strokec10 EAST\cf4 \strokec4 );\cb1 \
\cb3         \cf12 \strokec12 //
\f1 \'b9\'f6\'c6\'b0\'c0\'bb
\f0  
\f1 \'b3\'d6\'c0\'bb
\f0  
\f1 \'be\'c6\'b7\'a1
\f0  
\f1 \'c6\'d0\'b3\'ce
\f0  
\f1 \'bb\'fd\'bc\'ba
\f0  
\f1 \'c8\'c4
\f0  
\f1 \'c4\'dc\'c5\'d7\'c0\'cc\'b3\'ca\'bf\'a1
\f0  
\f1 \'c3\'df\'b0\'a1
\f0 \cf4 \cb1 \strokec4 \
\cb3         \cf5 \strokec5 DownPanel\cf4 \strokec4  \cf6 \strokec6 DP\cf4 \strokec4  = \cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 DownPanel\cf4 \strokec4 ();\cb1 \
\cb3         \cf6 \strokec6 MyCon\cf4 \strokec4 .\cf9 \strokec9 add\cf4 \strokec4 (\cf6 \strokec6 DP\cf4 \strokec4 , \cf5 \strokec5 BorderLayout\cf4 \strokec4 .\cf10 \strokec10 SOUTH\cf4 \strokec4 );\cb1 \
\cb3         \cb1 \
\cb3         \cf9 \strokec9 setSize\cf4 \strokec4 (\cf7 \strokec7 350\cf4 \strokec4 , \cf7 \strokec7 600\cf4 \strokec4 );\cb1 \
\cb3         \cf9 \strokec9 setVisible\cf4 \strokec4 (\cf2 \strokec2 true\cf4 \strokec4 );\cb1 \
\cb3     \}\cb1 \
\cb3     \cf2 \strokec2 class\cf4 \strokec4  \cf5 \strokec5 UpPanel\cf4 \strokec4  \cf2 \strokec2 extends\cf4 \strokec4  \cf5 \strokec5 JPanel\cf4 \strokec4  \{\cb1 \
\cb3         \cf2 \strokec2 public\cf4 \strokec4  \cf9 \strokec9 UpPanel\cf4 \strokec4 () \{\cb1 \
\cb3             \cf9 \strokec9 setLayout\cf4 \strokec4 (\cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 GridLayout\cf4 \strokec4 (\cf7 \strokec7 3\cf4 \strokec4 , \cf7 \strokec7 1\cf4 \strokec4 ));\cb1 \
\cb3             \cf9 \strokec9 setBackground\cf4 \strokec4 (\cf5 \strokec5 Color\cf4 \strokec4 .\cf10 \strokec10 LIGHT_GRAY\cf4 \strokec4 );\cb1 \
\cb3             \cf6 \strokec6 info\cf4 \strokec4  = \cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 JLabel\cf4 \strokec4 (\cf8 \strokec8 ""\cf4 \strokec4 );\cb1 \
\cb3             \cf6 \strokec6 label\cf4 \strokec4  = \cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 JLabel\cf4 \strokec4 (\cf8 \strokec8 "0"\cf4 \strokec4 );\cb1 \
\cb3             \cb1 \
\cb3             \cf6 \strokec6 info\cf4 \strokec4 .\cf9 \strokec9 setFont\cf4 \strokec4 (\cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 Font\cf4 \strokec4 (\cf8 \strokec8 "
\f1 \'b8\'bc\'c0\'ba
\f0  
\f1 \'b0\'ed\'b5\'f1
\f0 "\cf4 \strokec4 , \cf7 \strokec7 0\cf4 \strokec4 , \cf7 \strokec7 40\cf4 \strokec4 ));\cb1 \
\cb3             \cf6 \strokec6 info\cf4 \strokec4 .\cf9 \strokec9 setForeground\cf4 \strokec4 (\cf5 \strokec5 Color\cf4 \strokec4 .\cf10 \strokec10 BLACK\cf4 \strokec4 );\cb1 \
\cb3             \cf6 \strokec6 info\cf4 \strokec4 .\cf9 \strokec9 setHorizontalAlignment\cf4 \strokec4 (\cf5 \strokec5 SwingConstants\cf4 \strokec4 .\cf10 \strokec10 RIGHT\cf4 \strokec4 );\cb1 \
\cb3             \cb1 \
\cb3             \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 setFont\cf4 \strokec4 (\cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 Font\cf4 \strokec4 (\cf8 \strokec8 "
\f1 \'b8\'bc\'c0\'ba
\f0  
\f1 \'b0\'ed\'b5\'f1
\f0 "\cf4 \strokec4 , \cf5 \strokec5 Font\cf4 \strokec4 .\cf10 \strokec10 BOLD\cf4 \strokec4  , \cf7 \strokec7 55\cf4 \strokec4 ));\cb1 \
\cb3             \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 setForeground\cf4 \strokec4 (\cf5 \strokec5 Color\cf4 \strokec4 .\cf10 \strokec10 BLACK\cf4 \strokec4 );\cb1 \
\cb3             \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 setHorizontalAlignment\cf4 \strokec4 (\cf5 \strokec5 SwingConstants\cf4 \strokec4 .\cf10 \strokec10 RIGHT\cf4 \strokec4 );\cb1 \
\cb3             \cb1 \
\cb3             \cf9 \strokec9 add\cf4 \strokec4 (\cf6 \strokec6 info\cf4 \strokec4 );\cb1 \
\cb3             \cf9 \strokec9 add\cf4 \strokec4 (\cf6 \strokec6 label\cf4 \strokec4 );\cb1 \
\cb3         \}\cb1 \
\cb3     \}\cb1 \
\cb3     \cb1 \
\cb3     \cf2 \strokec2 class\cf4 \strokec4  \cf5 \strokec5 DownPanel\cf4 \strokec4  \cf2 \strokec2 extends\cf4 \strokec4  \cf5 \strokec5 JPanel\cf4 \strokec4 \{\cb1 \
\cb3         \cf2 \strokec2 public\cf4 \strokec4  \cf9 \strokec9 DownPanel\cf4 \strokec4 () \{\cb1 \
\cb3             \cf5 \strokec5 JButton\cf4 \strokec4 [] \cf6 \strokec6 bt\cf4 \strokec4  = \cf11 \strokec11 new\cf4 \strokec4  \cf5 \strokec5 JButton\cf4 \strokec4 [\cf7 \strokec7 20\cf4 \strokec4 ];\cb1 \
\cb3             \cf9 \strokec9 setLayout\cf4 \strokec4 (\cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 GridLayout\cf4 \strokec4 (\cf7 \strokec7 5\cf4 \strokec4 , \cf7 \strokec7 4\cf4 \strokec4 , \cf7 \strokec7 5\cf4 \strokec4 , \cf7 \strokec7 5\cf4 \strokec4 ));\cb1 \
\cb3             \cf9 \strokec9 setBackground\cf4 \strokec4 (\cf5 \strokec5 Color\cf4 \strokec4 .\cf10 \strokec10 DARK_GRAY\cf4 \strokec4 );\cb1 \
\cb3             \cb1 \
\cb3             \cf6 \strokec6 bt\cf4 \strokec4 [\cf7 \strokec7 0\cf4 \strokec4 ] = \cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 JButton\cf4 \strokec4 (\cf8 \strokec8 "\'d7"\cf4 \strokec4 );\cb1 \
\cb3             \cf6 \strokec6 bt\cf4 \strokec4 [\cf7 \strokec7 1\cf4 \strokec4 ] = \cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 JButton\cf4 \strokec4 (\cf8 \strokec8 "\'f7"\cf4 \strokec4 );\cb1 \
\cb3             \cf6 \strokec6 bt\cf4 \strokec4 [\cf7 \strokec7 2\cf4 \strokec4 ] = \cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 JButton\cf4 \strokec4 (\cf8 \strokec8 "AC"\cf4 \strokec4 );\cb1 \
\cb3             \cf6 \strokec6 bt\cf4 \strokec4 [\cf7 \strokec7 3\cf4 \strokec4 ] = \cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 JButton\cf4 \strokec4 (\cf8 \strokec8 "C"\cf4 \strokec4 );\cb1 \
\
\cb3             \cf6 \strokec6 bt\cf4 \strokec4 [\cf7 \strokec7 4\cf4 \strokec4 ] = \cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 JButton\cf4 \strokec4 (\cf8 \strokec8 "7"\cf4 \strokec4 );\cb1 \
\cb3             \cf6 \strokec6 bt\cf4 \strokec4 [\cf7 \strokec7 5\cf4 \strokec4 ] = \cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 JButton\cf4 \strokec4 (\cf8 \strokec8 "8"\cf4 \strokec4 );\cb1 \
\cb3             \cf6 \strokec6 bt\cf4 \strokec4 [\cf7 \strokec7 6\cf4 \strokec4 ] = \cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 JButton\cf4 \strokec4 (\cf8 \strokec8 "9"\cf4 \strokec4 );\cb1 \
\cb3             \cf6 \strokec6 bt\cf4 \strokec4 [\cf7 \strokec7 7\cf4 \strokec4 ] = \cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 JButton\cf4 \strokec4 (\cf8 \strokec8 "\uc0\u8730 "\cf4 \strokec4 );\cb1 \
\cb3             \cb1 \
\cb3             \cf6 \strokec6 bt\cf4 \strokec4 [\cf7 \strokec7 8\cf4 \strokec4 ] = \cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 JButton\cf4 \strokec4 (\cf8 \strokec8 "4"\cf4 \strokec4 );\cb1 \
\cb3             \cf6 \strokec6 bt\cf4 \strokec4 [\cf7 \strokec7 9\cf4 \strokec4 ] = \cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 JButton\cf4 \strokec4 (\cf8 \strokec8 "5"\cf4 \strokec4 );\cb1 \
\cb3             \cf6 \strokec6 bt\cf4 \strokec4 [\cf7 \strokec7 10\cf4 \strokec4 ] = \cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 JButton\cf4 \strokec4 (\cf8 \strokec8 "6"\cf4 \strokec4 );\cb1 \
\cb3             \cf6 \strokec6 bt\cf4 \strokec4 [\cf7 \strokec7 11\cf4 \strokec4 ] = \cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 JButton\cf4 \strokec4 (\cf8 \strokec8 "-"\cf4 \strokec4 );\cb1 \
\cb3             \cb1 \
\cb3             \cf6 \strokec6 bt\cf4 \strokec4 [\cf7 \strokec7 12\cf4 \strokec4 ] = \cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 JButton\cf4 \strokec4 (\cf8 \strokec8 "1"\cf4 \strokec4 );\cb1 \
\cb3             \cf6 \strokec6 bt\cf4 \strokec4 [\cf7 \strokec7 13\cf4 \strokec4 ] = \cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 JButton\cf4 \strokec4 (\cf8 \strokec8 "2"\cf4 \strokec4 );\cb1 \
\cb3             \cf6 \strokec6 bt\cf4 \strokec4 [\cf7 \strokec7 14\cf4 \strokec4 ] = \cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 JButton\cf4 \strokec4 (\cf8 \strokec8 "3"\cf4 \strokec4 );\cb1 \
\cb3             \cf6 \strokec6 bt\cf4 \strokec4 [\cf7 \strokec7 15\cf4 \strokec4 ] = \cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 JButton\cf4 \strokec4 (\cf8 \strokec8 "+"\cf4 \strokec4 );\cb1 \
\cb3             \cb1 \
\cb3             \cf6 \strokec6 bt\cf4 \strokec4 [\cf7 \strokec7 16\cf4 \strokec4 ] = \cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 JButton\cf4 \strokec4 (\cf8 \strokec8 "
\f1 \'a3\'de
\f0 2"\cf4 \strokec4 );\cb1 \
\cb3             \cf6 \strokec6 bt\cf4 \strokec4 [\cf7 \strokec7 17\cf4 \strokec4 ] = \cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 JButton\cf4 \strokec4 (\cf8 \strokec8 "0"\cf4 \strokec4 );\cb1 \
\cb3             \cf6 \strokec6 bt\cf4 \strokec4 [\cf7 \strokec7 18\cf4 \strokec4 ] = \cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 JButton\cf4 \strokec4 (\cf8 \strokec8 "."\cf4 \strokec4 );\cb1 \
\cb3             \cf6 \strokec6 bt\cf4 \strokec4 [\cf7 \strokec7 19\cf4 \strokec4 ] = \cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 JButton\cf4 \strokec4 (\cf8 \strokec8 "="\cf4 \strokec4 );\cb1 \
\cb3             \cb1 \
\cb3             \cf11 \strokec11 for\cf4 \strokec4 (\cf5 \strokec5 int\cf4 \strokec4  \cf6 \strokec6 i\cf4 \strokec4  = \cf7 \strokec7 0\cf4 \strokec4 ; \cf6 \strokec6 i\cf4 \strokec4  <= \cf7 \strokec7 19\cf4 \strokec4 ; \cf6 \strokec6 i\cf4 \strokec4 ++) \{\cb1 \
\cb3                 \cf6 \strokec6 bt\cf4 \strokec4 [\cf6 \strokec6 i\cf4 \strokec4 ].\cf9 \strokec9 setPreferredSize\cf4 \strokec4 (\cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 Dimension\cf4 \strokec4 (\cf7 \strokec7 0\cf4 \strokec4 , \cf7 \strokec7 65\cf4 \strokec4 ));\cb1 \
\cb3                 \cf6 \strokec6 bt\cf4 \strokec4 [\cf6 \strokec6 i\cf4 \strokec4 ].\cf9 \strokec9 setFont\cf4 \strokec4 (\cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 Font\cf4 \strokec4 (\cf8 \strokec8 "
\f1 \'b8\'bc\'c0\'ba
\f0  
\f1 \'b0\'ed\'b5\'f1
\f0 "\cf4 \strokec4 , \cf7 \strokec7 0\cf4 \strokec4 , \cf7 \strokec7 20\cf4 \strokec4 ));\cb1 \
\cb3                 \cf6 \strokec6 bt\cf4 \strokec4 [\cf6 \strokec6 i\cf4 \strokec4 ].\cf9 \strokec9 setForeground\cf4 \strokec4 (\cf5 \strokec5 Color\cf4 \strokec4 .\cf10 \strokec10 BLACK\cf4 \strokec4 );\cb1 \
\cb3                 \cf6 \strokec6 bt\cf4 \strokec4 [\cf6 \strokec6 i\cf4 \strokec4 ].\cf9 \strokec9 setBackground\cf4 \strokec4 (\cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 Color\cf4 \strokec4 (\cf7 \strokec7 240\cf4 \strokec4 , \cf7 \strokec7 240\cf4 \strokec4 , \cf7 \strokec7 240\cf4 \strokec4 ));\cb1 \
\cb3                 \cf11 \strokec11 if\cf4 \strokec4 (\cf7 \strokec7 3\cf4 \strokec4  < \cf6 \strokec6 i\cf4 \strokec4  && \cf6 \strokec6 i\cf4 \strokec4  < \cf7 \strokec7 15\cf4 \strokec4  && \cf6 \strokec6 i\cf4 \strokec4  % \cf7 \strokec7 4\cf4 \strokec4  != \cf7 \strokec7 3\cf4 \strokec4 ) \{\cb1 \
\cb3                     \cf6 \strokec6 bt\cf4 \strokec4 [\cf6 \strokec6 i\cf4 \strokec4 ].\cf9 \strokec9 addActionListener\cf4 \strokec4 (\cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 ActionListener\cf4 \strokec4 () \{\cb1 \
\cb3                         \cb1 \
\cb3                         @\cf5 \strokec5 Override\cf4 \cb1 \strokec4 \
\cb3                         \cf2 \strokec2 public\cf4 \strokec4  \cf5 \strokec5 void\cf4 \strokec4  \cf9 \strokec9 actionPerformed\cf4 \strokec4 (\cf5 \strokec5 ActionEvent\cf4 \strokec4  \cf6 \strokec6 e\cf4 \strokec4 ) \{\cb1 \
\cb3                             \cf5 \strokec5 JButton\cf4 \strokec4  \cf6 \strokec6 b\cf4 \strokec4  = (\cf5 \strokec5 JButton\cf4 \strokec4 )\cf6 \strokec6 e\cf4 \strokec4 .\cf9 \strokec9 getSource\cf4 \strokec4 ();\cb1 \
\cb3                             \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 getText\cf4 \strokec4 () == \cf8 \strokec8 "0"\cf4 \strokec4 ) \{\cb1 \
\cb3                                 \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf8 \strokec8 ""\cf4 \strokec4 );\cb1 \
\cb3                             \}\cb1 \
\cb3                             \cf5 \strokec5 String\cf4 \strokec4  \cf6 \strokec6 labeltext\cf4 \strokec4  = \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 getText\cf4 \strokec4 ();\cb1 \
\cb3                             \cf5 \strokec5 String\cf4 \strokec4  \cf6 \strokec6 text\cf4 \strokec4  = \cf6 \strokec6 b\cf4 \strokec4 .\cf9 \strokec9 getText\cf4 \strokec4 ();\cb1 \
\cb3                             \cf5 \strokec5 String\cf4 \strokec4  \cf6 \strokec6 newtext\cf4 \strokec4  = \cf6 \strokec6 labeltext\cf4 \strokec4  + \cf6 \strokec6 text\cf4 \strokec4 ;\cb1 \
\cb3                             \cf5 \strokec5 int\cf4 \strokec4  \cf6 \strokec6 n\cf4 \strokec4  = \cf6 \strokec6 newtext\cf4 \strokec4 .\cf9 \strokec9 length\cf4 \strokec4 ();\cb1 \
\cb3                             \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 n\cf4 \strokec4  <= \cf7 \strokec7 10\cf4 \strokec4 ) \{\cb1 \
\cb3                                 \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf6 \strokec6 newtext\cf4 \strokec4 );\cb1 \
\cb3                             \}\cb1 \
\cb3                             \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 info\cf4 \strokec4 .\cf9 \strokec9 getText\cf4 \strokec4 ().\cf9 \strokec9 contains\cf4 \strokec4 (\cf8 \strokec8 "="\cf4 \strokec4 ) == \cf2 \strokec2 true\cf4 \strokec4 ) \{\cb1 \
\cb3                                 \cf6 \strokec6 info\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf8 \strokec8 ""\cf4 \strokec4 );\cb1 \
\cb3                                 \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf6 \strokec6 b\cf4 \strokec4 .\cf9 \strokec9 getText\cf4 \strokec4 ());\cb1 \
\cb3                                 \cf6 \strokec6 result\cf4 \strokec4  = \cf7 \strokec7 0\cf4 \strokec4 ;\cb1 \
\cb3                                 \cf6 \strokec6 num\cf4 \strokec4  = \cf7 \strokec7 0\cf4 \strokec4 ;\cb1 \
\cb3                             \}\cb1 \
\cb3                         \}\cb1 \
\cb3                     \});\cb1 \
\cb3                 \}\cf11 \strokec11 else\cf4 \strokec4  \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 i\cf4 \strokec4  == \cf7 \strokec7 17\cf4 \strokec4 ) \{\cb1 \
\cb3                     \cf6 \strokec6 bt\cf4 \strokec4 [\cf6 \strokec6 i\cf4 \strokec4 ].\cf9 \strokec9 addActionListener\cf4 \strokec4 (\cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 ActionListener\cf4 \strokec4 () \{\cb1 \
\cb3                         \cb1 \
\cb3                         @\cf5 \strokec5 Override\cf4 \cb1 \strokec4 \
\cb3                         \cf2 \strokec2 public\cf4 \strokec4  \cf5 \strokec5 void\cf4 \strokec4  \cf9 \strokec9 actionPerformed\cf4 \strokec4 (\cf5 \strokec5 ActionEvent\cf4 \strokec4  \cf6 \strokec6 e\cf4 \strokec4 ) \{\cb1 \
\cb3                             \cf5 \strokec5 JButton\cf4 \strokec4  \cf6 \strokec6 b\cf4 \strokec4  = (\cf5 \strokec5 JButton\cf4 \strokec4 )\cf6 \strokec6 e\cf4 \strokec4 .\cf9 \strokec9 getSource\cf4 \strokec4 ();\cb1 \
\cb3                             \cf5 \strokec5 String\cf4 \strokec4  \cf6 \strokec6 labeltext\cf4 \strokec4  = \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 getText\cf4 \strokec4 ();\cb1 \
\cb3                             \cf5 \strokec5 String\cf4 \strokec4  \cf6 \strokec6 text\cf4 \strokec4  = \cf6 \strokec6 b\cf4 \strokec4 .\cf9 \strokec9 getText\cf4 \strokec4 ();\cb1 \
\cb3                             \cf5 \strokec5 String\cf4 \strokec4  \cf6 \strokec6 newtext\cf4 \strokec4  = \cf6 \strokec6 labeltext\cf4 \strokec4  + \cf6 \strokec6 text\cf4 \strokec4 ;\cb1 \
\cb3                             \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 labeltext\cf4 \strokec4  == \cf8 \strokec8 "0"\cf4 \strokec4 ) \{\cb1 \
\cb3                                 \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf8 \strokec8 "0"\cf4 \strokec4 );\cb1 \
\cb3                             \}\cf11 \strokec11 else\cf4 \strokec4  \{\cb1 \
\cb3                                 \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf6 \strokec6 newtext\cf4 \strokec4 );\cb1 \
\cb3                             \}\cb1 \
\cb3                             \cb1 \
\cb3                         \}\cb1 \
\cb3                     \});\cb1 \
\cb3                 \}\cf11 \strokec11 else\cf4 \strokec4  \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 i\cf4 \strokec4  == \cf7 \strokec7 19\cf4 \strokec4 ) \{\cb1 \
\cb3                     \cf6 \strokec6 bt\cf4 \strokec4 [\cf6 \strokec6 i\cf4 \strokec4 ].\cf9 \strokec9 setBackground\cf4 \strokec4 (\cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 Color\cf4 \strokec4 (\cf7 \strokec7 78\cf4 \strokec4 , \cf7 \strokec7 197\cf4 \strokec4 , \cf7 \strokec7 255\cf4 \strokec4 ));\cb1 \
\cb3                     \cf6 \strokec6 bt\cf4 \strokec4 [\cf6 \strokec6 i\cf4 \strokec4 ].\cf9 \strokec9 addActionListener\cf4 \strokec4 (\cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 Result\cf4 \strokec4 ());\cb1 \
\cb3                 \}\cf11 \strokec11 else\cf4 \strokec4  \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 i\cf4 \strokec4  % \cf7 \strokec7 4\cf4 \strokec4  == \cf7 \strokec7 3\cf4 \strokec4  || \cf6 \strokec6 i\cf4 \strokec4  < \cf7 \strokec7 3\cf4 \strokec4  || \cf7 \strokec7 15\cf4 \strokec4  < \cf6 \strokec6 i\cf4 \strokec4 ) \{\cb1 \
\cb3                     \cf6 \strokec6 bt\cf4 \strokec4 [\cf6 \strokec6 i\cf4 \strokec4 ].\cf9 \strokec9 setBackground\cf4 \strokec4 (\cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 Color\cf4 \strokec4 (\cf7 \strokec7 218\cf4 \strokec4 , \cf7 \strokec7 218\cf4 \strokec4 , \cf7 \strokec7 218\cf4 \strokec4 ));\cb1 \
\cb3                     \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 i\cf4 \strokec4  == \cf7 \strokec7 2\cf4 \strokec4 ) \{\cb1 \
\cb3                             \cf6 \strokec6 bt\cf4 \strokec4 [\cf6 \strokec6 i\cf4 \strokec4 ].\cf9 \strokec9 addActionListener\cf4 \strokec4 (\cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 ActionListener\cf4 \strokec4 () \{\cb1 \
\cb3                             \cb1 \
\cb3                             @\cf5 \strokec5 Override\cf4 \cb1 \strokec4 \
\cb3                             \cf2 \strokec2 public\cf4 \strokec4  \cf5 \strokec5 void\cf4 \strokec4  \cf9 \strokec9 actionPerformed\cf4 \strokec4 (\cf5 \strokec5 ActionEvent\cf4 \strokec4  \cf6 \strokec6 e\cf4 \strokec4 ) \{\cb1 \
\cb3                                 \cf5 \strokec5 int\cf4 \strokec4  \cf6 \strokec6 n\cf4 \strokec4  = \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 getText\cf4 \strokec4 ().\cf9 \strokec9 length\cf4 \strokec4 ();\cb1 \
\cb3                                 \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 n\cf4 \strokec4  >= \cf7 \strokec7 0\cf4 \strokec4 ) \{\cb1 \
\cb3                                     \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf8 \strokec8 "0"\cf4 \strokec4 );\cb1 \
\cb3                                     \cf6 \strokec6 info\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf8 \strokec8 ""\cf4 \strokec4 );\cb1 \
\cb3                                 \}\cb1 \
\cb3                                 \cf6 \strokec6 result\cf4 \strokec4  = \cf7 \strokec7 0\cf4 \strokec4 ;\cb1 \
\cb3                             \}\cb1 \
\cb3                         \});\cb1 \
\cb3                     \}\cf11 \strokec11 else\cf4 \strokec4  \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 i\cf4 \strokec4  == \cf7 \strokec7 3\cf4 \strokec4 ) \{\cb1 \
\cb3                         \cf6 \strokec6 bt\cf4 \strokec4 [\cf6 \strokec6 i\cf4 \strokec4 ].\cf9 \strokec9 addActionListener\cf4 \strokec4 (\cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 ActionListener\cf4 \strokec4 () \{\cb1 \
\cb3                             \cb1 \
\cb3                             @\cf5 \strokec5 Override\cf4 \cb1 \strokec4 \
\cb3                             \cf2 \strokec2 public\cf4 \strokec4  \cf5 \strokec5 void\cf4 \strokec4  \cf9 \strokec9 actionPerformed\cf4 \strokec4 (\cf5 \strokec5 ActionEvent\cf4 \strokec4  \cf6 \strokec6 e\cf4 \strokec4 ) \{\cb1 \
\cb3                                 \cf5 \strokec5 int\cf4 \strokec4  \cf6 \strokec6 n\cf4 \strokec4  = \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 getText\cf4 \strokec4 ().\cf9 \strokec9 length\cf4 \strokec4 ();\cb1 \
\cb3                                 \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 n\cf4 \strokec4  > \cf7 \strokec7 0\cf4 \strokec4 ) \{\cb1 \
\cb3                                     \cf9 \strokec9 setBackSpace\cf4 \strokec4 (\cf9 \strokec9 getBackSpace\cf4 \strokec4 ().\cf9 \strokec9 substring\cf4 \strokec4 (\cf7 \strokec7 0\cf4 \strokec4 , \cf9 \strokec9 getBackSpace\cf4 \strokec4 ().\cf9 \strokec9 length\cf4 \strokec4 () - \cf7 \strokec7 1\cf4 \strokec4 ));\cb1 \
\cb3                                 \}\cb1 \
\cb3                                 \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 getText\cf4 \strokec4 () == \cf8 \strokec8 ""\cf4 \strokec4 ) \{\cb1 \
\cb3                                     \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf8 \strokec8 "0"\cf4 \strokec4 );\cb1 \
\cb3                                 \}\cb1 \
\cb3                             \}\cb1 \
\cb3                         \});\cb1 \
\cb3                     \}\cf11 \strokec11 else\cf4 \strokec4  \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 i\cf4 \strokec4  == \cf7 \strokec7 18\cf4 \strokec4 ) \{\cb1 \
\cb3                         \cf6 \strokec6 bt\cf4 \strokec4 [\cf6 \strokec6 i\cf4 \strokec4 ].\cf9 \strokec9 addActionListener\cf4 \strokec4 (\cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 ActionListener\cf4 \strokec4 () \{\cb1 \
\cb3                             \cb1 \
\cb3                             @\cf5 \strokec5 Override\cf4 \cb1 \strokec4 \
\cb3                             \cf2 \strokec2 public\cf4 \strokec4  \cf5 \strokec5 void\cf4 \strokec4  \cf9 \strokec9 actionPerformed\cf4 \strokec4 (\cf5 \strokec5 ActionEvent\cf4 \strokec4  \cf6 \strokec6 e\cf4 \strokec4 ) \{\cb1 \
\cb3                                 \cf5 \strokec5 JButton\cf4 \strokec4  \cf6 \strokec6 b\cf4 \strokec4  = (\cf5 \strokec5 JButton\cf4 \strokec4 )\cf6 \strokec6 e\cf4 \strokec4 .\cf9 \strokec9 getSource\cf4 \strokec4 ();\cb1 \
\cb3                                 \cf5 \strokec5 String\cf4 \strokec4  \cf6 \strokec6 labeltext\cf4 \strokec4  = \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 getText\cf4 \strokec4 ();\cb1 \
\cb3                                 \cf5 \strokec5 String\cf4 \strokec4  \cf6 \strokec6 text\cf4 \strokec4  = \cf6 \strokec6 b\cf4 \strokec4 .\cf9 \strokec9 getText\cf4 \strokec4 ();\cb1 \
\cb3                                 \cf5 \strokec5 String\cf4 \strokec4  \cf6 \strokec6 newtext\cf4 \strokec4  = \cf6 \strokec6 labeltext\cf4 \strokec4  + \cf6 \strokec6 text\cf4 \strokec4 ;\cb1 \
\cb3                                 \cf5 \strokec5 int\cf4 \strokec4  \cf6 \strokec6 n\cf4 \strokec4  = \cf6 \strokec6 newtext\cf4 \strokec4 .\cf9 \strokec9 length\cf4 \strokec4 ();\cb1 \
\cb3                                 \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 getText\cf4 \strokec4 ().\cf9 \strokec9 contains\cf4 \strokec4 (\cf6 \strokec6 b\cf4 \strokec4 .\cf9 \strokec9 getText\cf4 \strokec4 ()) == \cf2 \strokec2 false\cf4 \strokec4  && \cf6 \strokec6 n\cf4 \strokec4  < \cf7 \strokec7 10\cf4 \strokec4 ) \{\cb1 \
\cb3                                         \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf6 \strokec6 newtext\cf4 \strokec4 );\cb1 \
\cb3                                 \}\cb1 \
\cb3                                 \}\cb1 \
\cb3                         \});\cb1 \
\cb3                     \}\cf11 \strokec11 else\cf4 \strokec4  \{\cb1 \
\cb3                         \cf6 \strokec6 bt\cf4 \strokec4 [\cf6 \strokec6 i\cf4 \strokec4 ].\cf9 \strokec9 addActionListener\cf4 \strokec4 (\cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 Result\cf4 \strokec4 ());\cb1 \
\cb3                     \}\cb1 \
\cb3                 \}\cb1 \
\cb3                 \cf9 \strokec9 add\cf4 \strokec4 (\cf6 \strokec6 bt\cf4 \strokec4 [\cf6 \strokec6 i\cf4 \strokec4 ]);\cb1 \
\cb3             \}\cb1 \
\cb3         \}       \cb1 \
\cb3     \}\cb1 \
\cb3     \cb1 \
\cb3     \cf2 \strokec2 public\cf4 \strokec4  \cf2 \strokec2 class\cf4 \strokec4  \cf5 \strokec5 Result\cf4 \strokec4  \cf2 \strokec2 implements\cf4 \strokec4  \cf5 \strokec5 ActionListener\cf4 \strokec4 \{\cb1 \
\cb3         \cf2 \strokec2 public\cf4 \strokec4  \cf5 \strokec5 void\cf4 \strokec4  \cf9 \strokec9 actionPerformed\cf4 \strokec4 (\cf5 \strokec5 ActionEvent\cf4 \strokec4  \cf6 \strokec6 e\cf4 \strokec4 ) \{\cb1 \
\cb3             \cf5 \strokec5 JButton\cf4 \strokec4  \cf6 \strokec6 b\cf4 \strokec4  = (\cf5 \strokec5 JButton\cf4 \strokec4 )\cf6 \strokec6 e\cf4 \strokec4 .\cf9 \strokec9 getSource\cf4 \strokec4 ();\cb1 \
\cb3             \cf5 \strokec5 String\cf4 \strokec4  \cf6 \strokec6 labeltext\cf4 \strokec4  = \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 getText\cf4 \strokec4 ();\cb1 \
\cb3             \cf5 \strokec5 String\cf4 \strokec4  \cf6 \strokec6 text\cf4 \strokec4  = \cf6 \strokec6 b\cf4 \strokec4 .\cf9 \strokec9 getText\cf4 \strokec4 ();\cb1 \
\cb3             \cf5 \strokec5 String\cf4 \strokec4  \cf6 \strokec6 newtext\cf4 \strokec4  = \cf6 \strokec6 labeltext\cf4 \strokec4  + \cf6 \strokec6 text\cf4 \strokec4 ;\cb1 \
\cb3             \cf5 \strokec5 int\cf4 \strokec4  \cf6 \strokec6 n\cf4 \strokec4  = \cf6 \strokec6 newtext\cf4 \strokec4 .\cf9 \strokec9 length\cf4 \strokec4 ();\cb1 \
\cb3             \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 text\cf4 \strokec4  != \cf8 \strokec8 "
\f1 \'a3\'de
\f0 2"\cf4 \strokec4 ) \{\cb1 \
\cb3                 \cf6 \strokec6 num\cf4 \strokec4  = \cf5 \strokec5 Double\cf4 \strokec4 .\cf9 \strokec9 parseDouble\cf4 \strokec4 (\cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 getText\cf4 \strokec4 ().\cf9 \strokec9 substring\cf4 \strokec4 (\cf7 \strokec7 0\cf4 \strokec4 , \cf6 \strokec6 n\cf4 \strokec4  - \cf7 \strokec7 1\cf4 \strokec4 ));              \cb1 \
\cb3             \}\cb1 \
\cb3             \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 math\cf4 \strokec4  == \cf8 \strokec8 "+"\cf4 \strokec4 ) \{\cb1 \
\cb3                 \cf6 \strokec6 result\cf4 \strokec4  += \cf6 \strokec6 num\cf4 \strokec4 ;\cb1 \
\cb3                 \cf6 \strokec6 math\cf4 \strokec4  = \cf8 \strokec8 ""\cf4 \strokec4 ;\cb1 \
\cb3             \}\cf11 \strokec11 else\cf4 \strokec4  \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 math\cf4 \strokec4  == \cf8 \strokec8 "-"\cf4 \strokec4 ) \{\cb1 \
\cb3                 \cf6 \strokec6 result\cf4 \strokec4  -= \cf6 \strokec6 num\cf4 \strokec4 ;\cb1 \
\cb3                 \cf6 \strokec6 math\cf4 \strokec4  = \cf8 \strokec8 ""\cf4 \strokec4 ;\cb1 \
\cb3             \}\cf11 \strokec11 else\cf4 \strokec4  \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 math\cf4 \strokec4  == \cf8 \strokec8 "\'d7"\cf4 \strokec4 ) \{\cb1 \
\cb3                 \cf6 \strokec6 result\cf4 \strokec4  *= \cf6 \strokec6 num\cf4 \strokec4 ;\cb1 \
\cb3                 \cf6 \strokec6 math\cf4 \strokec4  = \cf8 \strokec8 ""\cf4 \strokec4 ;\cb1 \
\cb3             \}\cf11 \strokec11 else\cf4 \strokec4  \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 math\cf4 \strokec4  == \cf8 \strokec8 "\'f7"\cf4 \strokec4 ) \{\cb1 \
\cb3                 \cf6 \strokec6 result\cf4 \strokec4  /= \cf6 \strokec6 num\cf4 \strokec4 ;\cb1 \
\cb3                 \cf6 \strokec6 math\cf4 \strokec4  = \cf8 \strokec8 ""\cf4 \strokec4 ;\cb1 \
\cb3             \}\cb1 \
\cb3             \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 math\cf4 \strokec4  == \cf8 \strokec8 ""\cf4 \strokec4 ) \{\cb1 \
\cb3                 \cf6 \strokec6 math\cf4 \strokec4  = \cf6 \strokec6 b\cf4 \strokec4 .\cf9 \strokec9 getText\cf4 \strokec4 ();         \cb1 \
\cb3             \}\cb1 \
\cb3             \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 info\cf4 \strokec4 .\cf9 \strokec9 getText\cf4 \strokec4 () == \cf8 \strokec8 ""\cf4 \strokec4  && \cf6 \strokec6 text\cf4 \strokec4  != \cf8 \strokec8 "
\f1 \'a3\'de
\f0 2"\cf4 \strokec4  && \cf6 \strokec6 text\cf4 \strokec4  != \cf8 \strokec8 "="\cf4 \strokec4 ) \{\cb1 \
\cb3                 \cf6 \strokec6 info\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf6 \strokec6 newtext\cf4 \strokec4 );\cb1 \
\cb3                 \cf6 \strokec6 result\cf4 \strokec4  = \cf6 \strokec6 num\cf4 \strokec4 ;\cb1 \
\cb3                 \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf8 \strokec8 "0"\cf4 \strokec4 );\cb1 \
\cb3             \}\cf11 \strokec11 else\cf4 \strokec4  \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 info\cf4 \strokec4 .\cf9 \strokec9 getText\cf4 \strokec4 () != \cf8 \strokec8 ""\cf4 \strokec4  && \cf6 \strokec6 text\cf4 \strokec4  != \cf8 \strokec8 "
\f1 \'a3\'de
\f0 2"\cf4 \strokec4  && \cf6 \strokec6 text\cf4 \strokec4  != \cf8 \strokec8 "="\cf4 \strokec4 )\{\cb1 \
\cb3                 \cf6 \strokec6 result\cf4 \strokec4  = (\cf5 \strokec5 Math\cf4 \strokec4 .\cf9 \strokec9 round\cf4 \strokec4 (\cf6 \strokec6 result\cf4 \strokec4 *\cf7 \strokec7 1000000000\cf4 \strokec4 )/\cf7 \strokec7 1000000000.0\cf4 \strokec4 );\cb1 \
\cb3                 \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 result\cf4 \strokec4  % \cf7 \strokec7 1\cf4 \strokec4  == \cf7 \strokec7 0\cf4 \strokec4 ) \{\cb1 \
\cb3                     \cf6 \strokec6 info\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 ((\cf5 \strokec5 int\cf4 \strokec4 ) \cf6 \strokec6 result\cf4 \strokec4  + \cf6 \strokec6 text\cf4 \strokec4 );\cb1 \
\cb3                     \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf8 \strokec8 "0"\cf4 \strokec4 );\cb1 \
\cb3                 \}\cf11 \strokec11 else\cf4 \strokec4  \{\cb1 \
\cb3                     \cf6 \strokec6 info\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf6 \strokec6 result\cf4 \strokec4  + \cf6 \strokec6 text\cf4 \strokec4 );\cb1 \
\cb3                     \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf8 \strokec8 "0"\cf4 \strokec4 );\cb1 \
\cb3                 \}\cb1 \
\cb3             \}\cb1 \
\cb3             \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 text\cf4 \strokec4  == \cf8 \strokec8 "
\f1 \'a3\'de
\f0 2"\cf4 \strokec4 ) \{\cb1 \
\cb3                 \cf6 \strokec6 num\cf4 \strokec4  = \cf5 \strokec5 Double\cf4 \strokec4 .\cf9 \strokec9 parseDouble\cf4 \strokec4 (\cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 getText\cf4 \strokec4 ().\cf9 \strokec9 substring\cf4 \strokec4 (\cf7 \strokec7 0\cf4 \strokec4 , \cf6 \strokec6 n\cf4 \strokec4  - \cf7 \strokec7 2\cf4 \strokec4 ));\cb1 \
\cb3                 \cf6 \strokec6 math\cf4 \strokec4  = \cf8 \strokec8 ""\cf4 \strokec4 ;\cb1 \
\cb3                 \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 info\cf4 \strokec4 .\cf9 \strokec9 getText\cf4 \strokec4 () == \cf8 \strokec8 ""\cf4 \strokec4 ) \{\cb1 \
\cb3                     \cf6 \strokec6 result\cf4 \strokec4  = (\cf5 \strokec5 Math\cf4 \strokec4 .\cf9 \strokec9 round\cf4 \strokec4 ((\cf5 \strokec5 Math\cf4 \strokec4 .\cf9 \strokec9 pow\cf4 \strokec4 (\cf6 \strokec6 num\cf4 \strokec4 , \cf7 \strokec7 2\cf4 \strokec4 ))*\cf7 \strokec7 1000000000\cf4 \strokec4 )/\cf7 \strokec7 1000000000.0\cf4 \strokec4 );\cb1 \
\cb3                     \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 result\cf4 \strokec4  % \cf7 \strokec7 1\cf4 \strokec4  == \cf7 \strokec7 0\cf4 \strokec4 ) \{\cb1 \
\cb3                         \cf6 \strokec6 info\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf8 \strokec8 "pow("\cf4 \strokec4  + (\cf5 \strokec5 int\cf4 \strokec4 ) \cf6 \strokec6 num\cf4 \strokec4  + \cf8 \strokec8 ")"\cf4 \strokec4 );\cb1 \
\cb3                         \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf5 \strokec5 String\cf4 \strokec4 .\cf9 \strokec9 valueOf\cf4 \strokec4 ((\cf5 \strokec5 int\cf4 \strokec4 ) \cf6 \strokec6 result\cf4 \strokec4 ));\cb1 \
\cb3                     \}\cf11 \strokec11 else\cf4 \strokec4  \{\cb1 \
\cb3                         \cf6 \strokec6 info\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf8 \strokec8 "pow("\cf4 \strokec4  + \cf6 \strokec6 num\cf4 \strokec4  + \cf8 \strokec8 ")"\cf4 \strokec4 );\cb1 \
\cb3                         \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf5 \strokec5 String\cf4 \strokec4 .\cf9 \strokec9 valueOf\cf4 \strokec4 (\cf6 \strokec6 result\cf4 \strokec4 ));\cb1 \
\cb3                     \}\cb1 \
\cb3                 \}\cf11 \strokec11 else\cf4 \strokec4  \{\cb1 \
\cb3                     \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 result\cf4 \strokec4  % \cf7 \strokec7 1\cf4 \strokec4  == \cf7 \strokec7 0\cf4 \strokec4 ) \{\cb1 \
\cb3                         \cf6 \strokec6 info\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf8 \strokec8 "pow("\cf4 \strokec4  + (\cf5 \strokec5 int\cf4 \strokec4 ) \cf6 \strokec6 result\cf4 \strokec4  + \cf8 \strokec8 ")"\cf4 \strokec4 );\cb1 \
\cb3                         \cf6 \strokec6 result\cf4 \strokec4  = (\cf5 \strokec5 Math\cf4 \strokec4 .\cf9 \strokec9 round\cf4 \strokec4 ((\cf5 \strokec5 Math\cf4 \strokec4 .\cf9 \strokec9 pow\cf4 \strokec4 (\cf6 \strokec6 result\cf4 \strokec4 , \cf7 \strokec7 2\cf4 \strokec4 ))*\cf7 \strokec7 1000000000\cf4 \strokec4 )/\cf7 \strokec7 1000000000.0\cf4 \strokec4 );\cb1 \
\cb3                         \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf5 \strokec5 String\cf4 \strokec4 .\cf9 \strokec9 valueOf\cf4 \strokec4 ((\cf5 \strokec5 int\cf4 \strokec4 ) \cf6 \strokec6 result\cf4 \strokec4 ));\cb1 \
\cb3                     \}\cf11 \strokec11 else\cf4 \strokec4  \{\cb1 \
\cb3                         \cf6 \strokec6 info\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf8 \strokec8 "pow("\cf4 \strokec4  + \cf6 \strokec6 result\cf4 \strokec4  + \cf8 \strokec8 ")"\cf4 \strokec4 );\cb1 \
\cb3                         \cf6 \strokec6 result\cf4 \strokec4  = (\cf5 \strokec5 Math\cf4 \strokec4 .\cf9 \strokec9 round\cf4 \strokec4 ((\cf5 \strokec5 Math\cf4 \strokec4 .\cf9 \strokec9 pow\cf4 \strokec4 (\cf6 \strokec6 result\cf4 \strokec4 , \cf7 \strokec7 2\cf4 \strokec4 ))*\cf7 \strokec7 1000000000\cf4 \strokec4 )/\cf7 \strokec7 1000000000.0\cf4 \strokec4 );\cb1 \
\cb3                         \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf5 \strokec5 String\cf4 \strokec4 .\cf9 \strokec9 valueOf\cf4 \strokec4 (\cf6 \strokec6 result\cf4 \strokec4 ));\cb1 \
\cb3                     \}\cb1 \
\cb3                 \}\cb1 \
\cb3             \}\cb1 \
\cb3             \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 text\cf4 \strokec4  == \cf8 \strokec8 "\uc0\u8730 "\cf4 \strokec4 ) \{\cb1 \
\cb3                 \cf6 \strokec6 math\cf4 \strokec4  = \cf8 \strokec8 ""\cf4 \strokec4 ;\cb1 \
\cb3                 \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 info\cf4 \strokec4 .\cf9 \strokec9 getText\cf4 \strokec4 () == \cf8 \strokec8 ""\cf4 \strokec4 ) \{\cb1 \
\cb3                     \cf6 \strokec6 result\cf4 \strokec4  = (\cf5 \strokec5 Math\cf4 \strokec4 .\cf9 \strokec9 round\cf4 \strokec4 ((\cf5 \strokec5 Math\cf4 \strokec4 .\cf9 \strokec9 sqrt\cf4 \strokec4 (\cf6 \strokec6 num\cf4 \strokec4 ))*\cf7 \strokec7 1000000000\cf4 \strokec4 )/\cf7 \strokec7 1000000000.0\cf4 \strokec4 );\cb1 \
\cb3                     \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 result\cf4 \strokec4  % \cf7 \strokec7 1\cf4 \strokec4  == \cf7 \strokec7 0\cf4 \strokec4 ) \{\cb1 \
\cb3                         \cf6 \strokec6 info\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf8 \strokec8 "sqrt("\cf4 \strokec4  + (\cf5 \strokec5 int\cf4 \strokec4 ) \cf6 \strokec6 num\cf4 \strokec4  + \cf8 \strokec8 ")"\cf4 \strokec4 );\cb1 \
\cb3                         \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf5 \strokec5 String\cf4 \strokec4 .\cf9 \strokec9 valueOf\cf4 \strokec4 ((\cf5 \strokec5 int\cf4 \strokec4 ) \cf6 \strokec6 result\cf4 \strokec4 ));\cb1 \
\cb3                     \}\cf11 \strokec11 else\cf4 \strokec4  \{\cb1 \
\cb3                         \cf6 \strokec6 info\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf8 \strokec8 "sqrt("\cf4 \strokec4  + \cf6 \strokec6 num\cf4 \strokec4  + \cf8 \strokec8 ")"\cf4 \strokec4 );\cb1 \
\cb3                         \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf5 \strokec5 String\cf4 \strokec4 .\cf9 \strokec9 valueOf\cf4 \strokec4 (\cf6 \strokec6 result\cf4 \strokec4 ));\cb1 \
\cb3                     \}\cb1 \
\cb3                 \}\cf11 \strokec11 else\cf4 \strokec4  \{\cb1 \
\cb3                     \cf11 \strokec11 if\cf4 \strokec4 (\cf5 \strokec5 Math\cf4 \strokec4 .\cf9 \strokec9 sqrt\cf4 \strokec4 (\cf6 \strokec6 result\cf4 \strokec4 ) % \cf7 \strokec7 1\cf4 \strokec4  == \cf7 \strokec7 0\cf4 \strokec4 ) \{\cb1 \
\cb3                         \cf6 \strokec6 info\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf8 \strokec8 "sqrt("\cf4 \strokec4  + (\cf5 \strokec5 int\cf4 \strokec4 ) \cf6 \strokec6 result\cf4 \strokec4  + \cf8 \strokec8 ")"\cf4 \strokec4 );\cb1 \
\cb3                         \cf6 \strokec6 result\cf4 \strokec4  = (\cf5 \strokec5 Math\cf4 \strokec4 .\cf9 \strokec9 round\cf4 \strokec4 ((\cf5 \strokec5 Math\cf4 \strokec4 .\cf9 \strokec9 sqrt\cf4 \strokec4 (\cf6 \strokec6 result\cf4 \strokec4 ))*\cf7 \strokec7 1000000000\cf4 \strokec4 )/\cf7 \strokec7 1000000000.0\cf4 \strokec4 );\cb1 \
\cb3                         \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf5 \strokec5 String\cf4 \strokec4 .\cf9 \strokec9 valueOf\cf4 \strokec4 ((\cf5 \strokec5 int\cf4 \strokec4 ) \cf6 \strokec6 result\cf4 \strokec4 ));\cb1 \
\cb3                     \}\cf11 \strokec11 else\cf4 \strokec4  \{\cb1 \
\cb3                         \cf6 \strokec6 info\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf8 \strokec8 "sqrt("\cf4 \strokec4  + \cf6 \strokec6 result\cf4 \strokec4  + \cf8 \strokec8 ")"\cf4 \strokec4 );\cb1 \
\cb3                         \cf6 \strokec6 result\cf4 \strokec4  = (\cf5 \strokec5 Math\cf4 \strokec4 .\cf9 \strokec9 round\cf4 \strokec4 ((\cf5 \strokec5 Math\cf4 \strokec4 .\cf9 \strokec9 sqrt\cf4 \strokec4 (\cf6 \strokec6 result\cf4 \strokec4 ))*\cf7 \strokec7 1000000000\cf4 \strokec4 )/\cf7 \strokec7 1000000000.0\cf4 \strokec4 );\cb1 \
\cb3                         \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf5 \strokec5 String\cf4 \strokec4 .\cf9 \strokec9 valueOf\cf4 \strokec4 (\cf6 \strokec6 result\cf4 \strokec4 ));\cb1 \
\cb3                     \}\cb1 \
\cb3                 \}\cb1 \
\cb3             \}\cb1 \
\cb3             \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 text\cf4 \strokec4  == \cf8 \strokec8 "="\cf4 \strokec4 ) \{\cb1 \
\cb3                 \cf6 \strokec6 math\cf4 \strokec4  = \cf8 \strokec8 ""\cf4 \strokec4 ;\cb1 \
\cb3                 \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 info\cf4 \strokec4 .\cf9 \strokec9 getText\cf4 \strokec4 () != \cf8 \strokec8 ""\cf4 \strokec4  && \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 getText\cf4 \strokec4 () != \cf8 \strokec8 ""\cf4 \strokec4  && \cf6 \strokec6 info\cf4 \strokec4 .\cf9 \strokec9 getText\cf4 \strokec4 ().\cf9 \strokec9 contains\cf4 \strokec4 (\cf6 \strokec6 text\cf4 \strokec4 ) == \cf2 \strokec2 false\cf4 \strokec4 ) \{\cb1 \
\cb3                     \cf11 \strokec11 if\cf4 \strokec4 (\cf6 \strokec6 result\cf4 \strokec4  % \cf7 \strokec7 1\cf4 \strokec4  == \cf7 \strokec7 0\cf4 \strokec4 ) \{\cb1 \
\cb3                         \cf6 \strokec6 info\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf6 \strokec6 info\cf4 \strokec4 .\cf9 \strokec9 getText\cf4 \strokec4 () + \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 getText\cf4 \strokec4 () + \cf6 \strokec6 text\cf4 \strokec4 );\cb1 \
\cb3                         \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf5 \strokec5 String\cf4 \strokec4 .\cf9 \strokec9 valueOf\cf4 \strokec4 ((\cf5 \strokec5 int\cf4 \strokec4 ) \cf6 \strokec6 result\cf4 \strokec4 ));\cb1 \
\cb3                     \}\cf11 \strokec11 else\cf4 \strokec4  \{\cb1 \
\cb3                         \cf6 \strokec6 info\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf6 \strokec6 info\cf4 \strokec4 .\cf9 \strokec9 getText\cf4 \strokec4 () + \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 getText\cf4 \strokec4 () + \cf6 \strokec6 text\cf4 \strokec4 );\cb1 \
\cb3                         \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf5 \strokec5 String\cf4 \strokec4 .\cf9 \strokec9 valueOf\cf4 \strokec4 (\cf6 \strokec6 result\cf4 \strokec4 ));\cb1 \
\cb3                     \}\cb1 \
\cb3                 \}\cb1 \
\cb3             \}\cb1 \
\cb3         \}\cb1 \
\cb3     \}\cb1 \
\cb3     \cb1 \
\cb3     \cf2 \strokec2 public\cf4 \strokec4  \cf5 \strokec5 double\cf4 \strokec4  \cf9 \strokec9 Calculator\cf4 \strokec4 (\cf5 \strokec5 String\cf4 \strokec4  \cf6 \strokec6 ss\cf4 \strokec4 ) \{\cb1 \
\cb3         \cf11 \strokec11 return\cf4 \strokec4  \cf7 \strokec7 0\cf4 \strokec4 ;\cb1 \
\cb3     \}\cb1 \
\cb3     \cf2 \strokec2 private\cf4 \strokec4  \cf5 \strokec5 void\cf4 \strokec4  \cf9 \strokec9 setBackSpace\cf4 \strokec4 (\cf5 \strokec5 String\cf4 \strokec4  \cf6 \strokec6 bs\cf4 \strokec4 ) \{\cb1 \
\cb3         \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 setText\cf4 \strokec4 (\cf6 \strokec6 bs\cf4 \strokec4 );\cb1 \
\cb3     \}\cb1 \
\cb3     \cb1 \
\cb3     \cf2 \strokec2 private\cf4 \strokec4  \cf5 \strokec5 String\cf4 \strokec4  \cf9 \strokec9 getBackSpace\cf4 \strokec4 () \{\cb1 \
\cb3         \cf11 \strokec11 return\cf4 \strokec4  \cf6 \strokec6 label\cf4 \strokec4 .\cf9 \strokec9 getText\cf4 \strokec4 ();\cb1 \
\cb3     \}\cb1 \
\
\cb3     \cf2 \strokec2 public\cf4 \strokec4  \cf2 \strokec2 static\cf4 \strokec4  \cf5 \strokec5 void\cf4 \strokec4  \cf9 \strokec9 main\cf4 \strokec4 (\cf5 \strokec5 String\cf4 \strokec4 [] \cf6 \strokec6 args\cf4 \strokec4 ) \{\cb1 \
\cb3         \cf11 \strokec11 new\cf4 \strokec4  \cf9 \strokec9 Calculator2\cf4 \strokec4 ();\cb1 \
\cb3     \}\cb1 \
\cb3 \}\cb1 \
\
}