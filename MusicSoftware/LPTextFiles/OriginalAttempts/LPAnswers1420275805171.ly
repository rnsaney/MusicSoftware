
\version "2.18.2"
\header { 
	title = "Bass Clef Test"
}
\score{
	\new Staff {
		\clef bass

		d'1 f' b, a b b, a e, e' a 
		d' g f, d' e' g, b c d e, 
		d' c, c, c d, b, f' e, g e' 
		g f, d, d, a f d b a f 
		d a b, a, e g d a d' f' 
		c, b d' e, d' a c, g, f e 
		a g, e e' c' e c, a g, c, 
		b, c' a b f d d' e, b e' 
		a, c d, c g a, d, a, f' g 
		f c, e f' d, d' e f' d b }
		\addlyrics 
		{ D F B A B B A E E A D G F D E G B C D E D C C C D B F E G E G F D D A F D B A F D A B A E G D A D F C B D E D A C G F E A G E E C E C A G C B C A B F D D E B E A C D C G A D A F G F C E F D D E F D B }
}