
\version "2.18.2"
\header { 
	title = "Bass Clef Test"
 composer = "Ralph Norris Smith"
}
\score{
	\new Staff {
		\clef bass

		a1 g c, b, g, e, f f f e, 
		a, b, b d g d a e, d' e, 
		d, a e a a b b, d' a, a, 
		d, f, d e' c g, f a, c' b 
		b, f, b d, f a d, e d' g 
		e e' g, a d e, g g d, e 
		g b g, g c c d, a c f 
		f b b b g, a d, d' e, g 
		b e, e, e' f g c, c, e' b 
		d d, d f, f d' e' e' d, g, 
		c, c, g e, g, d, a b g f 
		c' a d' e, c' g g e' d' f 
		b c' g g d g f g, e, e 
		c, c, b c' b e' g a e, g 
		b d, g, a, g a d' f, c' c' }
		\addlyrics 
		{ A G C B G E F F F E A B B D G D A E D E D A E A A B B D A A D F D E C G F A C B B F B D F A D E D G E E G A D E G G D E G B G G C C D A C F F B B B G A D D E G B E E E F G C C E B D D D F F D E E D G C C G E G D A B G F C A D E C G G E D F B C G G D G F G E E C C B C B E G A E G B D G A G A D F C C }
}