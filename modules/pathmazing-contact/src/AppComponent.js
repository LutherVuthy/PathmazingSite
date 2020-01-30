import React, {useState} from 'react';
import ReactDOM from 'react-dom';
import ClayAlert from '@clayui/alert';

export default function AppComponent(props) {
    const [toastItems, setToastItems] = useState([]);

    const [name, setName] = useState("");
    const [email, setEmail] = useState("");
    const [company, setCompany] = useState("");
    const [des, setDesc] = useState("");
    const [by, setBy] = useState("Technology Partnership");

    const handleSubmit = (e) => {
        e.preventDefault();
        setToastItems([...toastItems, Math.random() * 100]);
    };

    return (
        <React.Fragment>
            <section id="pathmazing-contact" className="contact-form">
                <div className="container">
                    <div className="row">
                        <div className="col-md-6">
                            <p className="lead wow fadeInUp animate" data-wow-delay="0.2s">
                                Let Us Help You Realize Your Mobile and Web Solutions Today
                            </p>
                            <form onSubmit={handleSubmit} name="pathmazing-contact-form">
                                <div className="form-group  wow fadeInUp animate" data-wow-delay="0.3s">
                                    <input className="form-control" placeholder="Your name" type="text" value={name}
                                           onChange={e => setName(e.target.value)}/>
                                </div>
                                <div className="form-group  wow fadeInUp animate" data-wow-delay="0.4s">
                                    <input className="form-control" placeholder="Your Email" type="text" value={email}
                                           onChange={e => setEmail(e.target.value)}/>
                                </div>
                                <div className="form-group wow fadeInUp animate" data-wow-delay="0.5s">
                                    <input className="form-control" placeholder="Your company name" type="text"
                                           value={company} onChange={e => setCompany(e.target.value)}/>
                                </div>

                                <div className="form-check  form-check-inline pb-4 wow fadeInUp animate"
                                     data-wow-delay="0.6s">
                                    <input className="form-check-input" type="radio" name="inlineRadioOptions"
                                           id="inlineRadio1" value="Technology Partnership"
                                           checked={by === "Technology Partnership"}
                                           onChange={e => setBy(e.currentTarget.value)}/>
                                    <label className="form-check-label" htmlFor="inlineRadio1">Technology
                                        Partnership</label>
                                </div>
                                <div className="form-check form-check-inline wow fadeInUp animate"
                                     data-wow-delay="0.6s">
                                    <input className="form-check-input " type="radio" name="inlineRadioOptions"
                                           id="inlineRadio2" value="By Project" checked={by === "By Project"}
                                           onChange={e => setBy(e.currentTarget.value)}/>
                                    <label className="form-check-label" htmlFor="inlineRadio2">By Project</label>
                                </div>
                                <div className="form-group wow fadeInUp animate" data-wow-delay="0.7s">
                                <textarea className="form-control" rows={6} placeholder="Describe Your Needs"
                                          value={des} onChange={e => setDesc(e.target.value)}/>
                                </div>
                                <p className=" wow fadeInUp animate" data-wow-delay="0.7s">We will contact you within 24
                                    hours</p>

                                <div className="form-group wow fadeInUp animate" data-wow-delay="0.8s">
                                    <button className="btn btn-primary" type="submit">
                                        SUBMIT
                                    </button>
                                </div>

                            </form>
                        </div>
                        <div className="col-md-6 pl-4">
                            <h1 className=" wow fadeInUp animate" data-wow-delay="0.2s">Contact Us</h1>
                            <div className="row">
                                <div className="col-xs-1 col-sm-1 col-md-1 wow fadeInUp animate" data-wow-delay="0.3s ">
                                    <img src="https://pathmazing.com/img/icon-map.png" alt="icon"/>
                                </div>
                                <div className="col-xs-11 col-sm-11 col-md-11 wow fadeInUp animate"
                                     data-wow-delay="0.4s">
                                    <p>Bayon Center, #33-34, Street 114, 6th Floor Sangkat Monorom,
                                        Khan 7 Makara Phnom penh, Cambodia
                                    </p>
                                </div>
                            </div>

                            <div className="row">
                                <div className="col-xs-1 col-sm-1 col-md-1 wow fadeInUp animate" data-wow-delay="0.5s">
                                    <img src="https://pathmazing.com/img/icon-phone.png" alt="icon"/>
                                </div>
                                <div className=" col-xs-11 col-sm-11 col-md-11 wow fadeInUp animate"
                                     data-wow-delay="0.6s">
                                    <h3>+855 23 991 628 </h3>
                                </div>
                            </div>

                            <div className="row">
                                <div className="col-xs-1 col-sm-1 col-md-1 wow fadeInUp animate" data-wow-delay="0.7s">
                                    <img src="https://pathmazing.com/img/icon-email.png" alt="icon"/>
                                </div>
                                <div className="col-xs-11 col-sm-11 col-md-11 wow fadeInUp animate"
                                     data-wow-delay="0.8s">
                                    <h3>sales@pathmazing.com </h3>
                                </div>

                            </div>
                            <div className="blk-map wow fadeInUp animate" data-wow-delay="0.9s">
                                <img className="img-responsive" src="https://pathmazing.com/img/contact/maps.png"/>
                            </div>
                        </div>
                    </div>
                </div>
            </section>

            <ClayAlert.ToastContainer>
                {toastItems.map(value => (
                    <ClayAlert
                        autoClose={5000}
                        key={value}
                        onClose={() => {
                            setToastItems(prevItems =>
                                prevItems.filter(item => item !== value)
                            );
                        }}
                        displayType="success"
                        title={"Successful!"}
                    >{`We will contact you within 24 hours`}</ClayAlert>
                ))}
            </ClayAlert.ToastContainer>
        </React.Fragment>
    );
}


