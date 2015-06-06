
\version "2.18.2"
\header { 
	title = "Bass Clef Test"
}
\score{
	\new Staff {
		\clef bass
		b1
		a d, d e, d' a d' a f' d,
		b g, e a, b, c g, c f' f,
		e d b, d e' d, d' d d, f
		g f b, e c' c f c' e, g
		a a, d, c, g, g c' b, c b,
		e, a b, f' d, d a e' c g,
		d, e a, d e, b c' d f' a
		d g e, e g c, a b d a,
		c, f' b g, a a f c' g, e,
		c c' d e c' f, f c' c' }
		\addlyrics { 
		B A D D E D A D A F D B G E A B C G C F F E D B D E D D D D F G F B E C C F C 		E G A A D C G G C B C B E A B F D D A E C G D E A D E B C D F A D G E E G C A 		B D A C F B G A A F C G E C C D E C F F C C }

}