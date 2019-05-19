find ancestor of a person from the social network file.

› The network is defined as a collection of people that are related by mother/father/children relationships.
› You will be provided a CSV (comma separated values) file that contains information about the network that we want to analyze
› Each row describes a person and has the following 3 attributes separated by a comma (“,”)
› Name
› string
› unique among all persons in our network
› Father name
› string
› optional (may be empty in case we don’t have information about the father)
› used to uniquely identify who the father of this person is
› Mother name
› string
› optional (may be empty in case we don’t have information about the mother)
› used to uniquely identify who the mother of this person is
› If a name appears in the father/mother name column, it is guaranteed that it will also appear on its own row
› No incest: The child-relationships always describe a DAG (Directed Acyclic Tree), so no children with mothers, sisters, cousins etc.


› Now that we’ve cleared those details, let’s start
› The first questions we have are about who are the ancestors of some people
› The ancestors of a person are that person’s parents as well as their parents’ parents and so on
› ancestors(x) = What is the list of ancestors of x, sorted in ascending alphabetical order?
› The output should be a list of names separated by commas, or the string “None” in case there are no ancestors
› Example:
› Input: ancestors(Enoch)
› Output: Adam,Cain,Eve