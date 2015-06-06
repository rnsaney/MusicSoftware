
\version "2.18.2"
\header { 
	title = "Bass Clef Test"
}
\score{
	\new Staff {
		\clef bass

		e1 a, d g, g g b f, d' d, 
		d, a, d' g, c' g, d, b e' c' 
		a g, d a, d' b, d' a, b f' 
		a b f, c d, g d' a, d' g, 
		c' d, g, f b d' a d, c, g 
		e, f g, g b a, g, e e, b 
		g, d' b, g f a b e' d b 
		d g c, f, c, b, e' d' g, f' 
		d, e g f' a b d a, b b 
		a, f e' f' c e e g g f, }
		\addlyrics 
		{ E A D G G G B F D D D A D G C G D B E C A G D A D B D A B F A B F C D G D A D G C D G F B D A D C G E F G G B A G E E B G D B G F A B E D B D G C F C B E D G F D E G F A B D A B B A F E F C E E G G F }
}