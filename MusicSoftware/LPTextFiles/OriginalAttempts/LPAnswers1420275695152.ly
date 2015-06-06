
\version "2.18.2"
\header { 
	title = "Bass Clef Test"
}
\score{
	\new Staff {
		\clef bass

		f1 c' c d g g b, c, a d 
		f' g f' d a, e' d, f, f d' 
		d, e g f, b b, d, a g g 
		a a b, f, b e' a b c, c, 
		f, e c, d' a b c g, a, g 
		d' f' c, d e, c g, d, g, f 
		b b, f c, b, e c g f' d 
		g g b g a g g e a, a 
		e c, d f' c' c, c a g, f, 
		f' d' c, d, d a, b f, g, b }
		\addlyrics 
		{ F C C D G G B C A D F G F D A E D F F D D E G F B B D A G G A A B F B E A B C C F E C D A B C G A G D F C D E C G D G F B B F C B E C G F D G G B G A G G E A A E C D F C C C A G F F D C D D A B F G B }
}