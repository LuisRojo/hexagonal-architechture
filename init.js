db.createCollection('persons');

db.persons.insertMany([
    {
        id: 1,
        name: 'Luis'
    },
    {
        id: 2,
        name: 'Alberto'
    },
    {
        id: 3,
        name: 'David'
    }
]);