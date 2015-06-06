
\version "2.18.2"
\header { 
	title = "Alto Clef Test"
 composer = "Ralph Norris Smith"
}
\score{
	\new Staff {
		\clef alto

		b1 c g c'' f b e' b d' g 
		e f b a c a a b c'' d'' 
		c' b c'' b e'' a f c e' e 
		a a b c c' c'' g d a b 
		f d' g e'' g c' e'' c f e'' 
		f b d'' d b b f d' e' g 
		a f e' f b a f d' g c' 
		c f e d' f d'' d'' d d'' g 
		e' c e c b a d' d'' g c 
		f d' c'' d'' c'' b d'' f f f 
		g c d'' c' c'' a a c g a 
		g c' f e d' f c'' f g f 
		g d d f c'' g b c c'' d 
		c b e' g c' e' b f g f 
		b d d'' e a b a a c d }
		\addlyrics 
		{ B C G C F B E B D G E F B A C A A B C D C B C B E A F C E E A A B C C C G D A B F D G E G C E C F E F B D D B B F D E G A F E F B A F D G C C F E D F D D D D G E C E C B A D D G C F D C D C B D F F F G C D C C A A C G A G C F E D F C F G F G D D F C G B C C D C B E G C E B F G F B D D E A B A A C D }
}