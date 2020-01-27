import React from 'react';
import ReactDOM from 'react-dom';

export default class extends React.Component {
    render() {
        return (
            <section id="pathmazing-contact" className="contact-form">
                <div className="container">
                    <div className="row">
                        <div className="col-md-6 col-sm-12 px-5">
                            <p className="lead">
                                Let Us Help You Realize Your Mobile and Web Solutions Today
                            </p>
                            <form action="#" name="pathmazing-contact-form">
                                <div className="form-group">
                                    <input className="form-control" placeholder="Your name" type="text"/>
                                </div>
                                <div className="form-group">
                                    <input className="form-control" placeholder="Your Email" type="text"/>
                                </div>
                                <div className="form-group">
                                    <input className="form-control" placeholder="Your company name" type="text"/>
                                </div>

                                <div className="form-check form-check-inline pb-4">
                                    <input className="form-check-input" type="radio" name="inlineRadioOptions"
                                           id="inlineRadio1" value="option1"/>
                                    <label className="form-check-label" htmlFor="inlineRadio1">Technology
                                        Partnership</label>
                                </div>
                                <div className="form-check form-check-inline">
                                    <input className="form-check-input" type="radio" name="inlineRadioOptions"
                                           id="inlineRadio2" value="option2"/>
                                    <label className="form-check-label" htmlFor="inlineRadio2">By Project</label>
                                </div>
                                <div className="form-group">
                                    <textarea className="form-control" rows={6} placeholder="Describe Your Needs"/>
                                </div>
                                <p>We will contact you within 24 hours</p>
                                <button className="btn btn-primary" type="submit">SUBMIT</button>

                            </form>
                        </div>
                        <div className="col-md-6 col-sm-12 px-5">
                            <h1>Contact Us</h1>
                            <div className="row">
                                <div className="col-md-1">
                                    <img src="https://pathmazing.com/img/icon-map.png" alt="icon"/>
                                </div>
                                <p className="col-md-11">Bayon Center, #33-34, Street 114, 6th Floor Sangkat Monorom,
                                    Khan 7 Makara Phnom penh, Cambodia
                                </p>
                            </div>

                            <div className="row">
                                <div className="col-md-1">
                                    <img src="https://pathmazing.com/img/icon-phone.png" alt="icon"/>
                                </div>
                                <h3 className="col-md-11">+855 23 991 628 </h3>
                            </div>

                            <div className="row">
                                <div className="col-md-1">
                                    <img src="https://pathmazing.com/img/icon-email.png" alt="icon"/>
                                </div>
                                <h3 className="col-md-11">sales@pathmazing.com </h3>
                            </div>
                            <div className="row contact-location">

                            </div>
                        </div>
                    </div>
                </div>
            </section>
        );
    }
}
