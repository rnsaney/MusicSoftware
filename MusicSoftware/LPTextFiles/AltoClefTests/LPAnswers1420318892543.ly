
\version "2.18.2"
\header { 
	title = "Alto Clef Test"
 composer = "Ralph Norris Smith"
}
\score{
	\new Staff {
		\clef alto

		c'1 d a b b f b g b f 
		g g d f e b a d'' a f 
		g f a f e' f f a d' b 
		d a e c c b g f c b 
		c c' a g b e'' d a a c 
		d f f e'' e' a e a e' c'' 
		d'' b b c' f d'' a c g a 
		e g a d' b b e' f e'' c 
		g c' b f d'' c e a b f 
		e g d d'' c'' c' b f g e'' 
		e c a d'' c' c'' a f f g 
		a d a b a g d' e'' f a 
		e'' e'' f f d'' b g g c' c' 
		f e'' d c'' e'' e'' e f a d'' 
		e'' b a a d e' c' e' c' e' }
		\addlyrics 
		{ C D A B B F B G B F G G D F E B A D A F G F A F E F F A D B D A E C C B G F C B C C A G B E D A A C D F F E E A E A E C D B B C F D A C G A E G A D B B E F E C G C B F D C E A B F E G D D C C B F G E E C A D C C A F F G A D A B A G D E F A E E F F D B G G C C F E D C E E E F A D E B A A D E C E C E }
}