import React from 'react';
import {useNavigate} from "react-router-dom";

const HomePage = () => {
    let navigate = useNavigate();
    const routeChange = () => {
        navigate("/chat");
    }
    return (
        <div>
            <h1> Welcome to the real chat application!</h1>
            <div>
                <h2> Eager to start? hit the button!</h2>
                <button type="submit" onClick={routeChange}>Start Chatting</button>
            </div>
        </div>
    );
};

export default HomePage;
