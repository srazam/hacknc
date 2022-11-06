from flask import Flask

app = Flask(__name__)

users = {
    "users": [
        {
            "name" : "jerry", 
            "food" : "Italian",
            "time" : "4"
        },
        {
            "name" : "bethany",
            "food" : "Chinese", 
            "time" : "7"
        },
        {
            "name" : "bob",
            "food" : "Japanese",
            "time" : "4"
        },
        {
            "name" : "sarah", 
            "food" : "Indian",
            "time" : "10"
        }
    ]
}

@app.route("/")
def all_users():
    return users

@app.route("/<name>")
def lookup(name):
    for n in users["users"]:
        if n["name"] == name:
            return n

api_url = 'http://127.0.0.1:8080/'

app.run(host='127.0.0.1', port=8080, debug=True)