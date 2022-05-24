import img from './image.imgs.full.high.webp'
import imgPhone from './contact-us.webp';
import img2 from './image2.webp';
import './Home.css'
import Categorias from '../Categorias/Categorias';
import Section from '../Section/Section';
const Home = () => {
    return (
        <>
        <div className="home">
            <div className="div1">
                <div id="div-phone">
                    <a href="/" className="tag-a-phone">
                        <img 
                        className="img-phone"
                        src={imgPhone}
                        alt="img-phone" />
                    </a>
                </div>
                <p className="info">
                    For any concerns or inquiries about your Ford vehicle, our Customer Relationship Center can be of assistance to you. Please call +632 8866 9408 or send us an email at 
                    <a href='mailto:emailus@ford' target='_blank' ><span> emailus@ford.</span></a>com.
                </p>
            </div>
            <a href="/">
            <img 
                className="ford-smart"
                src={img}
                alt="shop-ford-smart" />
            </a>
            <div className="description-vehicle">
                <p className="titulo1">A Ford vehicle for every lifestyle!</p>
                <p className="titulo2">See our full lineup of vehicles:</p>
            </div>
            <div className="carrusel-2">
                    <Categorias /> 
                
            </div>
            <a href="/">
                <img 
                    className="image2"
                    src={img2}
                    alt="ford-protect"
                />
            </a>
            <div className="description-2">
                <p className="titulo1">What's happening at Ford Philippines</p>
                <p className="titulo2">Stories, conversations and videos featuring people and the Fords they love.</p>
            </div>  
            <Section />
            <div className="div-imgMakeIt">
                <div className="div-makeIt">
                    <div>
                    <span>Make It Your Own</span>
                    </div>
                    <button className="btn-build">Build $ Price</button>
                </div>
            </div>  
            <div className="div-section3">
                <div className="div-search">
                    <span>Search for Nearby</span>
                    <span>Nearby</span>
                    <span>Ford Dealers</span>
                </div>
                <div>
                    
                </div>

            </div>
                
        </div>
        </>

    )
};

export default Home;
