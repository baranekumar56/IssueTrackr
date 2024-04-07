import React, { Component } from 'react';
import '../css/SideNav.css'; // Import CSS file for styling
import $ from 'jquery';
import {useNavigate} from 'react-router-dom';
import AccountCircleIcon from '@mui/icons-material/AccountCircle';
 const LogOut = () => {
  return(
    <div>
      <div>
      Do you want to log out?
      <span onClick={localStorage.removeItem('user')}>Ok</span>
      <span >Cancel</span>
      </div>
    </div>
  )
 }


const SideNav = ({user}) =>{
      const navigate = useNavigate();
      const  handleDelete = (e) => {
        localStorage.removeItem("user");
        navigate("/");
      }

      const iconStyle = {
        fontSize:'50px',
        color:'white',
        display:'inline'
      }

        return (
          <div className="sidenav">
            <div className="user_icon">
              <div><AccountCircleIcon style={iconStyle}/></div>     
              <div className='barane'><h2 className='user'>{user.name}</h2></div>
            </div>
            <a href="#">Send Mail</a>
            <a href="#">Connect to Members</a>
            <a href='#' className='logout' onClick={handleDelete}>Log out</a>
          </div>
        );
      };
  



export default SideNav;
