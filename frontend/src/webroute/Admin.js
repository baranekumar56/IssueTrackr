import React from "react";
import useNavigate from 'react'
const Admin = () => {

    const navigate = useNavigate();
    const user = JSON.parse(localStorage.getItem("user"));
    if (user === null){
      window.location.replace("/");
    }
    
    // Example usage:
    const userCookie = JSON.parse(localStorage.getItem('user'));
    if (userCookie) {
        console.log('User cookie:', userCookie);
    } else {
        console.log('User cookie not found');
    }

    return (
        <div>Hello World
             {userCookie.id}
        </div>
    );
}

export default Admin;