import React from 'react';
import {
    BrowserRouter as Router,
    Routes,
    Route
} from "react-router-dom";
import Header from '../header_footer/Header';
import Footer from '../header_footer/Footer';
import Welcome from '../welcome_page/Welcome';
import BooksPage from '../books/BooksPage';

function AppRouter() {
    return (
        <Router>
            <Header/>
            <Routes>
                <Route exact path="/" element={<Welcome/>}/>
                <Route path="/books" element={<BooksPage/>}/>
            </Routes>
            <Footer/>
        </Router>
    )
}

export default AppRouter;



