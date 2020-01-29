import React from 'react';
import ReactDOM from 'react-dom';

export default class extends React.Component {
    render() {
        return (
            <section id="pathmazing-contact" className="contact-form">
                <div className="container">
                    <div className="row">
                        <div className="col-sm-12 col-md-6">
                            <p className="lead wow fadeInUp animate" data-wow-delay="0.2s">
                                Let Us Help You Realize Your Mobile and Web Solutions Today
                            </p>
                            <form action="#" name="pathmazing-contact-form">
                                <div className="form-group  wow fadeInUp animate" data-wow-delay="0.3s">
                                    <input className="form-control" placeholder="Your name" type="text"/>
                                </div>
                                <div className="form-group  wow fadeInUp animate" data-wow-delay="0.4s">
                                    <input className="form-control" placeholder="Your Email" type="text"/>
                                </div>
                                <div className="form-group wow fadeInUp animate" data-wow-delay="0.5s">
                                    <input className="form-control" placeholder="Your company name" type="text"/>
                                </div>

                                <div className="form-check form-check-inline pb-4 wow fadeInUp animate" data-wow-delay="0.6s">
                                    <input className="form-check-input" type="radio" name="inlineRadioOptions"
                                           id="inlineRadio1" value="option1"/>
                                    <label className="form-check-label" htmlFor="inlineRadio1">Technology
                                        Partnership</label>
                                </div>
                                <div className="form-check form-check-inline wow fadeInUp animate" data-wow-delay="0.6s">
                                    <input className="form-check-input" type="radio" name="inlineRadioOptions"
                                           id="inlineRadio2" value="option2"/>
                                    <label className="form-check-label" htmlFor="inlineRadio2">By Project</label>
                                </div>
                                <div className="form-group wow fadeInUp animate" data-wow-delay="0.7s">
                                    <textarea className="form-control" rows={6} placeholder="Describe Your Needs"/>
                                </div>
                                <p className=" wow fadeInUp animate" data-wow-delay="0.7s">We will contact you within 24 hours</p>

                                <div className="form-group wow fadeInUp animate" data-wow-delay="0.8s">
                                    <button className="btn btn-primary" type="submit" >
                                        SUBMIT
                                    </button>
                                </div>

                            </form>
                        </div>
                        <div className=" col-sm-12 col-md-5 ml-auto">
                            <h1 className=" wow fadeInUp animate" data-wow-delay="0.2s">Contact Us</h1>
                            <div className="row">
                                <div className="col-md-1 wow fadeInUp animate" data-wow-delay="0.3s ">
                                    <img src="https://pathmazing.com/img/icon-map.png" alt="icon"/>
                                </div>
                                <p className="col-md-11 wow fadeInUp animate" data-wow-delay="0.4s">Bayon Center, #33-34, Street 114, 6th Floor Sangkat Monorom,
                                    Khan 7 Makara Phnom penh, Cambodia
                                </p>
                            </div>

                            <div className="row">
                                <div className="col-md-1 wow fadeInUp animate" data-wow-delay="0.5s">
                                    <img src="https://pathmazing.com/img/icon-phone.png" alt="icon"/>
                                </div>
                                <h3 className="col-md-11 wow fadeInUp animate" data-wow-delay="0.6s">+855 23 991 628 </h3>
                            </div>

                            <div className="row">
                                <div className="col-md-1 wow fadeInUp animate" data-wow-delay="0.7s">
                                    <img src="https://pathmazing.com/img/icon-email.png" alt="icon"/>
                                </div>
                                <h3 className="col-md-11 wow fadeInUp animate" data-wow-delay="0.8s">sales@pathmazing.com </h3>
                            </div>
                            <div className="blk-map wow fadeInUp animate" data-wow-delay="0.9s">
                                <img  class="img-responsive" src="https://pathmazing.com/img/contact/maps.png"/>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        );
    }
}
