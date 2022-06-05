# Notes on Envers

`
@Audited
`

When we use this anotation 2 things happen:
 - The revinfo table is created
 - For every entity anotated an additional table is created that keeps track of all the changes of the entity