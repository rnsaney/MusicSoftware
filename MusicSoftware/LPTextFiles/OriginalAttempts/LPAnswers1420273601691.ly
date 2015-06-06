
\version "2.18.2"
\header { 
	title = "Bass Clef Test"
}
\score{
	\new Staff {
		\clef bass

		g1 a, a d' f, b, g d a a, 
		e' e d' c' d, c a d' e, e 
		e, f c g, g, c, e' e f, a 
		a, d' f f e, d, e, e b e, 
		e d b a d a e, f' c e, 
		c' d a b a, c, b d, c' g, 
		f' a, e, d, a, e' b, c' b e, 
		g, f, g d e' a e' c, e' c, 
		g b g e, e b e b g a 
		e' f, c e e' e' d g, b a }
		\addlyrics 
		{ G A A D F B G D A A E E D C D C A D E E E F C G G C E E F A A D F F E D E E B E E D B A D A E F C E C D A B A C B D C G F A E D A E B C B E G F G D E A E C E C G B G E E B E B G A E F C E E E D G B A }
}