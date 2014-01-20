/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

// part 1
                        function DropDown(el) {
                                this.dd = el;
                                this.initEvents();
                        }
                        DropDown.prototype = {
                                initEvents : function() {
                                        var obj = this;

                                        obj.dd.on('click', function(event){
                                                $(this).toggleClass('active');
                                                event.stopPropagation();
                                        });	
                                }
                        }

                        $(function() {

                                var dd = new DropDown( $('#dd') );

                                $(document).click(function() {
                                        // all dropdowns
                                        $('.wrapper-dropdown-3').removeClass('active');
                                });

                        });
                        
// part 2

        var $ = jQuery.noConflict();
                $(function() {
                        $('#activator').click(function(){
                                        $('#box').animate({'top':'65px'},500);
                        });
                        $('#boxclose').click(function(){
                                        $('#box').animate({'top':'-400px'},500);
                        });
                        $('#activator_share').click(function(){
                                        $('#box_share').animate({'top':'65px'},500);
                        });
                        $('#boxclose_share').click(function(){
                                        $('#box_share').animate({'top':'-400px'},500);
                        });

                });
                $(document).ready(function(){

                //Hide (Collapse) the toggle containers on load
                $(".toggle_container").hide(); 

                //Switch the "Open" and "Close" state per click then slide up/down (depending on open/close state)
                $(".trigger").click(function(){
                        $(this).toggleClass("active").next().slideToggle("slow");
                        return false; //Prevent the browser jump to the link anchor
                });

                });
                
// part 3


  $(document).ready(function(){
                            $(".menu_body").hide();
                            //toggle the componenet with class menu_body
                            $(".menu_head").click(function(){
                                    $(this).next(".menu_body").slideToggle(600); 
                                    var plusmin;
                                    plusmin = $(this).children(".plusminus").text();

                                    if( plusmin == '+')
                                    $(this).children(".plusminus").text('-');
                                    else
                                    $(this).children(".plusminus").text('+');
                            });
                    });

