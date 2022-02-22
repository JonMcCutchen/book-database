import React from 'react';
import {Link} from 'react-router-dom';

function Welcome() {
    return(
        <div className="welcome">
            <h1>Welcome to the Book Database!</h1>
            <p><Link to="/books">Click</Link> to keep track of books you've read</p>
        </div>
    )
}

export default Welcome;