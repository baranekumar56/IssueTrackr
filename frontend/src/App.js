import './css/App.css';
import './css/styles.css';
import { BrowserRouter as Router, Route, Switch, Link, BrowserRouter, Routes } from 'react-router-dom';
import './webroute/Home';
import './webroute/Ticket';
import Home from './webroute/Home';
import Ticket from './webroute/Ticket';
import TicketQueue from './webroute/TicketQueue';
import TicketInfo from './webroute/TicketInfo';
import { useState } from 'react';
import { Routes as ReactRoutes, Route as ReactRoute} from 'react-router-dom';
import Login from './webroute/Login';
import Admin from './webroute/Admin';

function App() {


  return (
    <div className='App'>
      <ReactRoutes>
        <ReactRoute path='/' element={<Login/>}/>
        <ReactRoute path='/Ticket' element={<Ticket/>}/>
        <ReactRoute path='/TicketQueue' element={<TicketQueue/>} />
        <ReactRoute path='/TicketInfo' element={<TicketInfo/>}  />
        <ReactRoute path='/Admin' element={<Admin/>}/>
        
      </ReactRoutes>
    </div>
  );
}
export default App;
