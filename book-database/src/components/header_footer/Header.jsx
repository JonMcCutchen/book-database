import React from 'react';
import {Link} from 'react-router-dom';

function Header() {
    return (
        <header className="header">
            <div className="nav">
                <Link to='/'>Home</Link>
                <Link to='/books'>Books</Link>
            </div>
        </header>
    );
}

export default Header;

