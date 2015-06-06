
\version "2.18.2"
\header { 
	title = "Bass Clef Test"
}
\score{
	\new Staff {
		\clef bass

		g,1 f a, d e, a f e, d' e, 
		d g c' c e' f, g b, b c 
		g e' f' c, f' c' a, b b, c' 
		d c' a c, e b, d, g b b 
		d c f f' d a, g, d' c e' 
		c, f' c c' f, a, b f' g b 
		d' d' b g, d' b e, e, f, a 
		d' f d' f' f, e' d, c b f' 
		d b b a, e f, c' b f, d, 
		c, d e c, a, d, b, a a, f }
		\addlyrics 
		{ G F A D E A F E D E D G C C E F G B B C G E F C F C A B B C D C A C E B D G B B D C F F D A G D C E C F C C F A B F G B D D B G D B E E F A D F D F F E D C B F D B B A E F C B F D C D E C A D B A A F }
}