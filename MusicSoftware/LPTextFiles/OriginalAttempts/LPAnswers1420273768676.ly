
\version "2.18.2"
\header { 
	title = "Bass Clef Test"
}
\score{
	\new Staff {
		\clef bass

		a,1 c, b e c, a b c' d' d' 
		a, d, c' g, e d, c' g, d b, 
		a c' e' d, a d' a, a c' c' 
		g f, d, c' d b b, f, f, g, 
		e, f' g, g, e, e' b c d, g 
		a d c a, g c c' e d, g 
		g f' g f' b, f d, b, g a 
		f' c' c' e c' a b b e g 
		g, e d' c e' f, c' e, b a, 
		c' b g, b e, a, a g f, g }
		\addlyrics 
		{ A C B E C A B C D D A D C G E D C G D B A C E D A D A A C C G F D C D B B F F G E F G G E E B C D G A D C A G C C E D G G F G F B F D B G A F C C E C A B B E G G E D C E F C E B A C B G B E A A G F G }
}