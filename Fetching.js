import { useState,useEffect } from "react";

function Fetching(){
    const[users,setUsers] = useState([]);
        useEffect(() => {
        fetch("https://jsonplaceholder.typicode.com/posts/1/comments")
        .then(response => {
            return response.json();
        })
        .then(data => {
            setUsers(data)
        })

        },[])

        return (
            <div>
                <h1>Users List</h1>
                {users.map(user => (
                    <p key={user.id} >{user.name}</p>
     ))}
            </div>
        )
    }
    export default Fetching;
