# Notes on Envers

`
@Audited
`

When we use this anotation 2 things happen:
 - The revinfo table is created
 - For every entity anotated an additional table is created that keeps track of all the changes of the entity

`  
@CreatedBy;

@CreatedDate;

@LastModifiedBy;
`

Those annotations are provided by spring data :
 - The fields are populated by using the Interface AuditorAware provided by Spring Data 
 - The Bean must be configured to pick up this changed . In this project this is done in the class `AuditorAwareImpl.java`
 - To trigger the Audit functionality we must add the `@EntityListeners(AuditingEntityListener.class)` again provided by spring data to know make spring aware of the changes

We can see that hibernate envers provides more functionality than Spring data envers.

In my Opinion the main reason why i would not use spring data envers is that once a record is deleted or updated in the
database we do not know what the previous values were.

The positive is that we can use a combination of spring data and hibernate envers which I did in this project. The only point
i do not know is that a good practice in terms of performance. I would like some feedback :)