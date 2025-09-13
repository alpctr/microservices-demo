db = db.getSiblingDB('product-service');
db.createUser({
    user: "productUser",
    pwd: "secret123",
    roles: [
        { role: "readWrite", db: "product-service" }
    ]
});
