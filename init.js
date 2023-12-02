db.createCollection('players');

db.players.insertMany([
    {
        identification: UUID("4ee8d247-9ec5-441c-bef8-c2387944656c"),
        name: 'Luis',
        position: "forward"
    },
    {
        identification: UUID("c1f5567c-2f66-4ed7-8559-77abcb9ef8e0"),
        name: 'Alberto',
        position: "defender"
    },
    {
        identification: UUID("42028cf3-9884-4c52-b597-54e4a41f5716"),
        name: 'David',
        position: "midfielder"
    }
]);