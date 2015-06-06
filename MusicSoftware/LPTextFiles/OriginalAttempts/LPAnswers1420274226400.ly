
\version "2.18.2"
\header { 
	title = "Bass Clef Test"
}
\score{
	\new Staff {
		\clef bass

		a1 a, b, c' b a d, f, g d' 
		c' d' a g, f g d' a d, g 
		c' a e d' f e a, a a, f' 
		c' a a, a g c' a c' e' f 
		f' d b e f' a c g f' f' 
		b e' d, e' a d, e, b, d, a 
		c' c a, e c, d' e, b b e 
		g, a g a c, f d, f' d c 
		c' a, f' b e' f, b b b f' 
		d' g b a, g f' c, d e c, }
		\addlyrics 
		{ A A B C B A D F G D C D A G F G D A D G C A E D F E A A A F C A A A G C A C E F F D B E F A C G F F B E D E A D E B D A C C A E C D E B B E G A G A C F D F D C C A F B E F B B B F D G B A G F C D E C }
}