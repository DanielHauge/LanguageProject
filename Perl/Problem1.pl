use strict;
use warnings;
use Problem;

package Problem1;
use Class::Interface;
&implements( 'Problem' );

sub Calculate{
	my $self = shift;
};

sub new {
		my $class = shift;
		my $self = {
		_list => shift,
		_k = shift,
		_exp = shift,
	}
}