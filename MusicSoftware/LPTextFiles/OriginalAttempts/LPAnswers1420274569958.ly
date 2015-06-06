
\version "2.18.2"
\header { 
	title = "Bass Clef Test"
}
\score{
	\new Staff {
		\clef bass

		b,1 g g g, b g, f e, d g 
		c' g e' b c, d e d' f f 
		f, f f e' g, a, f f f a 
		e' g d' b b d' d' e' b e 
		b a e c, d, g c a, g, b, 
		a c a f, g d, e' c c' c' 
		c, e, c d' a e c' c, e' b 
		a d g, g f' d, c, c, f a 
		b, c, d, b, d' e c' b c, e, 
		f' f' c d' b, b, f' a g b, }
		\addlyrics 
		{ B G G G B G F E D G C G E B C D E D F F F F F E G A F F F A E G D B B D D E B E B A E C D G C A G B A C A F G D E C C C C E C D A E C C E B A D G G F D C C F A B C D B D E C B C E F F C D B B F A G B }
}