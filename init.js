db.createCollection('persons');

db.persons.insertMany([
    {
        personId: "1",
        name: 'Luis'
    },
    {
        personId: "2",
        name: 'Alberto'
    },
    {
        personId: "3",
        name: 'David'
    }
]);