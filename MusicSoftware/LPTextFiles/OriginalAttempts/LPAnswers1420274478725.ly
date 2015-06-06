
\version "2.18.2"
\header { 
	title = "Bass Clef Test"
}
\score{
	\new Staff {
		\clef bass

		b1 f, d, e, a b, e b, a, a 
		c, c' d e c, b e b f, e 
		a g b c' c a d, g c' f 
		f e, c' b d g e b g, b 
		g a, d' a e, b a d, a c, 
		a d' b a, d g d, g g c 
		a g b b, b, d, g b e, b 
		b c, c a e d, b, g e, d, 
		g a e, e' e g, e' d' a c, 
		d, f' d, d g, b, b g f' f' }
		\addlyrics 
		{ B F D E A B E B A A C C D E C B E B F E A G B C C A D G C F F E C B D G E B G B G A D A E B A D A C A D B A D G D G G C A G B B B D G B E B B C C A E D B G E D G A E E E G E D A C D F D D G B B G F F }
}