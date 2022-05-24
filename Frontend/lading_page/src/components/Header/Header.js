import logo from './ford-logo-updated.webp';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faLocationDot } from "@fortawesome/free-solid-svg-icons";
import { faFileArrowDown } from "@fortawesome/free-solid-svg-icons";
import { faMagnifyingGlass } from "@fortawesome/free-solid-svg-icons";

import './Header.css';

const Header = () => {
    return (
        <header className="headerItems">
                <img src={logo} alt="Logo" />
                <div className="nav-list">
                    <ul className="ul-list">
                        <li>Vehicles</li>
                        <li>Shop</li>
                        <li>Fleet</li>
                        <li>Engineering</li>
                        <li>About Ford</li>
                        <li>Owner</li>
                    </ul>
                    <ul className="ul-nav-bar">
                        <li>
                            <FontAwesomeIcon icon={faLocationDot} size="md" />
                            <span >Locate a Dealer</span>
                        </li>
                        <li>
                            <FontAwesomeIcon icon={faFileArrowDown} size="md" />
                            <span>Download Brochure</span>
                        </li>
                        <li>
                            <span>Log In</span>
                            <FontAwesomeIcon icon={faMagnifyingGlass} size="lg" />
                        </li>
                    </ul>
                </div>
        </header>
    )
}

export default Header;
