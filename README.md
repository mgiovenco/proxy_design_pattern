# proxy_design_pattern

#Intent

Provide a surrogate or placeholder for another object to control access to it.

Also known as "Surrogate".

#Motivation

One reason for controlling access to an object is to defer the full cost of its creation and initialization until we actually need to use it.  The solution is to use another object, a proxy, that acts as a stand-in for the real object.  The proxy acts just like the real object and takes care of instantiating it when it's required.

#Applicablility

Proxy is applicable whenever there is a need for a more versatile or sophisticated reference to an object other than a simple pointer.

Common situations in which the Proxy Pattern is applicable:
1) remote proxy = provides a local representative for an object in a different address space.
2) virtual proxy creates expensive objects on demand.
3) protection proxy = controls access to the original object (useful when objects should have different access rights).
4) smart reference = replacement for a bare pointer that performs additional actions when an object is accessed.

