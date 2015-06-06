
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
}