# Client-Server-Calculator

Built simple “Calculator” server (S) and Client agent (C) Java objects.

The client agent object reads input command/arithmetic operation from the user (U), invokes the calculate() method on the server IDL interface, gets the result back and pass it back to the User (U).

The interactions between the User, Client Agent, and the “Calculator” Server are synchronous, i.e., the user has to wait to receive the response to the calculation operation request before sending another request.

Interaction Example:
Client: + 2 4
Server: 6
Client: - 6 4
Server: 2
