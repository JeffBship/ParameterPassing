# ParameterPassing

This code demonstrates the difference in aliasing among user defined objects, String, and primitives.

ALL parameters in Java are pass by value.  However for objects, the value being passed is a reference.  Strings are immutable, therefore the reference is broken if there is any change.  This makes Strings pass like primitives in practical usage.
