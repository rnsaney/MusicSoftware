
\version "2.18.2"
\header { 
	title = "Alto Clef Test"
}
\score{
	\new Staff {
		\clef alto

		f1 g a g b d'' c'' g d' g 
		a b f a c a e' b d'' d'' 
		c'' f g b b a b e' b e'' 
		c' b a c' a d'' f d e'' e' 
		f b d' c g c' g a a b 
		d e'' b f g e e' f e' e' 
		e' c' d'' e f c' f f d' f 
		f a g a a c'' f g d' c'' 
		f b c' e' g g d' b e' a 
		c' b b d b f f a d b 
		g b e' b a b b c g d'' 
		d'' f d g f a d e' g f 
		b f g b f f g b e a 
		a c' e'' a f e' d'' c d' a 
		c a a d' d' d'' c'' a a a }
		\addlyrics 
		{ F G A G B D C G D G A B F A C A E B D D C F G B B A B E B E C B A C A D F D E E F B D C G C G A A B D E B F G E E F E E E C D E F C F F D F F A G A A C F G D C F B C E G G D B E A C B B D B F F A D B G B E B A B B C G D D F D G F A D E G F B F G B F F G B E A A C E A F E D C D A C A A D D D C A A A }
}