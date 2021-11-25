# maven-module-structures

Various ideas on how to structure multi-module projects with Maven.

## Definitions

`Project Object Model (POM)` - represents a description of a project.

`Parent POM` - a POM file that is referred to in the `<parent>` section of another POM file and enables inheritance.

`Child POM` - a POM file that specifies a `<parent>` element in order to inherit from it.

`Aggregator POM` - a POM file which defines a `modules` element.

`Parent Aggregator POM` - an amalgamation of Parent & Aggregator POMs.

`Bill of Materials (BOM) POM` - used to define a project's dependency versions in a centralised manner.
