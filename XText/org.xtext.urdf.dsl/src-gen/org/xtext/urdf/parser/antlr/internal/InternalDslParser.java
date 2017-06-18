package org.xtext.urdf.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.urdf.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Robot'", "'Topology'", "'Link'", "'isReuseOf'", "'add_to'", "'Joint'", "'ChildOf'", "'ParentOf'", "'Type'", "'->'", "'r->'", "'p->'", "'c->'", "'Inertial'", "'Inertia'", "'ixx'", "'ixy'", "'ixz'", "'iyy'", "'iyz'", "'izz'", "'Visual'", "'Box'", "'height'", "'length'", "'width'", "'Cylinder'", "'radius'", "'Mesh'", "'pathToFile'", "'scale'", "'Sphere'", "'Collision'", "'Origin'", "'x'", "'y'", "'z'", "'roll'", "'pitch'", "'yaw'", "'Mass'", "'mass_(ValueInKilograms)'", "'Color'", "'red'", "'green'", "'blue'", "'alpha'", "'Texture'", "'Limit'", "'effort'", "'velocity'", "'lower'", "'upper'", "'Axis'", "'Calibration'", "'rising'", "'falling'", "'Dynamics'", "'friction'", "'damping'", "'SafetyController'", "'softLowerLimit'", "'softUpperLimit'", "'k_position'", "'k_velocity'", "'.'", "'e'", "'+'", "'-'", "'Fixed'", "'Revolute'", "'Prismatic'", "'Continuous'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Robot";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRobot"
    // InternalDsl.g:65:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalDsl.g:65:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalDsl.g:66:2: iv_ruleRobot= ruleRobot EOF
            {
             newCompositeNode(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobot=ruleRobot();

            state._fsp--;

             current =iv_ruleRobot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalDsl.g:72:1: ruleRobot returns [EObject current=null] : (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'Topology' ( (lv_topologies_3_0= ruleTopology ) ) ) | ( (lv_link_4_0= ruleLink ) ) | ( (lv_joint_5_0= ruleJoint ) ) | ( (lv_linkrefs_6_0= ruleLinkRef ) ) )* ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_topologies_3_0 = null;

        EObject lv_link_4_0 = null;

        EObject lv_joint_5_0 = null;

        EObject lv_linkrefs_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:78:2: ( (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'Topology' ( (lv_topologies_3_0= ruleTopology ) ) ) | ( (lv_link_4_0= ruleLink ) ) | ( (lv_joint_5_0= ruleJoint ) ) | ( (lv_linkrefs_6_0= ruleLinkRef ) ) )* ) )
            // InternalDsl.g:79:2: (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'Topology' ( (lv_topologies_3_0= ruleTopology ) ) ) | ( (lv_link_4_0= ruleLink ) ) | ( (lv_joint_5_0= ruleJoint ) ) | ( (lv_linkrefs_6_0= ruleLinkRef ) ) )* )
            {
            // InternalDsl.g:79:2: (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'Topology' ( (lv_topologies_3_0= ruleTopology ) ) ) | ( (lv_link_4_0= ruleLink ) ) | ( (lv_joint_5_0= ruleJoint ) ) | ( (lv_linkrefs_6_0= ruleLinkRef ) ) )* )
            // InternalDsl.g:80:3: otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'Topology' ( (lv_topologies_3_0= ruleTopology ) ) ) | ( (lv_link_4_0= ruleLink ) ) | ( (lv_joint_5_0= ruleJoint ) ) | ( (lv_linkrefs_6_0= ruleLinkRef ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRobotAccess().getRobotKeyword_0());
            		
            // InternalDsl.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDsl.g:102:3: ( (otherlv_2= 'Topology' ( (lv_topologies_3_0= ruleTopology ) ) ) | ( (lv_link_4_0= ruleLink ) ) | ( (lv_joint_5_0= ruleJoint ) ) | ( (lv_linkrefs_6_0= ruleLinkRef ) ) )*
            loop1:
            do {
                int alt1=5;
                switch ( input.LA(1) ) {
                case 12:
                    {
                    alt1=1;
                    }
                    break;
                case 13:
                    {
                    alt1=2;
                    }
                    break;
                case 16:
                    {
                    alt1=3;
                    }
                    break;
                case 15:
                    {
                    alt1=4;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:103:4: (otherlv_2= 'Topology' ( (lv_topologies_3_0= ruleTopology ) ) )
            	    {
            	    // InternalDsl.g:103:4: (otherlv_2= 'Topology' ( (lv_topologies_3_0= ruleTopology ) ) )
            	    // InternalDsl.g:104:5: otherlv_2= 'Topology' ( (lv_topologies_3_0= ruleTopology ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_3); 

            	    					newLeafNode(otherlv_2, grammarAccess.getRobotAccess().getTopologyKeyword_2_0_0());
            	    				
            	    // InternalDsl.g:108:5: ( (lv_topologies_3_0= ruleTopology ) )
            	    // InternalDsl.g:109:6: (lv_topologies_3_0= ruleTopology )
            	    {
            	    // InternalDsl.g:109:6: (lv_topologies_3_0= ruleTopology )
            	    // InternalDsl.g:110:7: lv_topologies_3_0= ruleTopology
            	    {

            	    							newCompositeNode(grammarAccess.getRobotAccess().getTopologiesTopologyParserRuleCall_2_0_1_0());
            	    						
            	    pushFollow(FOLLOW_4);
            	    lv_topologies_3_0=ruleTopology();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getRobotRule());
            	    							}
            	    							add(
            	    								current,
            	    								"topologies",
            	    								lv_topologies_3_0,
            	    								"org.xtext.urdf.Dsl.Topology");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDsl.g:129:4: ( (lv_link_4_0= ruleLink ) )
            	    {
            	    // InternalDsl.g:129:4: ( (lv_link_4_0= ruleLink ) )
            	    // InternalDsl.g:130:5: (lv_link_4_0= ruleLink )
            	    {
            	    // InternalDsl.g:130:5: (lv_link_4_0= ruleLink )
            	    // InternalDsl.g:131:6: lv_link_4_0= ruleLink
            	    {

            	    						newCompositeNode(grammarAccess.getRobotAccess().getLinkLinkParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_link_4_0=ruleLink();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRobotRule());
            	    						}
            	    						add(
            	    							current,
            	    							"link",
            	    							lv_link_4_0,
            	    							"org.xtext.urdf.Dsl.Link");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDsl.g:149:4: ( (lv_joint_5_0= ruleJoint ) )
            	    {
            	    // InternalDsl.g:149:4: ( (lv_joint_5_0= ruleJoint ) )
            	    // InternalDsl.g:150:5: (lv_joint_5_0= ruleJoint )
            	    {
            	    // InternalDsl.g:150:5: (lv_joint_5_0= ruleJoint )
            	    // InternalDsl.g:151:6: lv_joint_5_0= ruleJoint
            	    {

            	    						newCompositeNode(grammarAccess.getRobotAccess().getJointJointParserRuleCall_2_2_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_joint_5_0=ruleJoint();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRobotRule());
            	    						}
            	    						add(
            	    							current,
            	    							"joint",
            	    							lv_joint_5_0,
            	    							"org.xtext.urdf.Dsl.Joint");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDsl.g:169:4: ( (lv_linkrefs_6_0= ruleLinkRef ) )
            	    {
            	    // InternalDsl.g:169:4: ( (lv_linkrefs_6_0= ruleLinkRef ) )
            	    // InternalDsl.g:170:5: (lv_linkrefs_6_0= ruleLinkRef )
            	    {
            	    // InternalDsl.g:170:5: (lv_linkrefs_6_0= ruleLinkRef )
            	    // InternalDsl.g:171:6: lv_linkrefs_6_0= ruleLinkRef
            	    {

            	    						newCompositeNode(grammarAccess.getRobotAccess().getLinkrefsLinkRefParserRuleCall_2_3_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_linkrefs_6_0=ruleLinkRef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRobotRule());
            	    						}
            	    						add(
            	    							current,
            	    							"linkrefs",
            	    							lv_linkrefs_6_0,
            	    							"org.xtext.urdf.Dsl.LinkRef");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleTopology"
    // InternalDsl.g:193:1: entryRuleTopology returns [EObject current=null] : iv_ruleTopology= ruleTopology EOF ;
    public final EObject entryRuleTopology() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopology = null;


        try {
            // InternalDsl.g:193:49: (iv_ruleTopology= ruleTopology EOF )
            // InternalDsl.g:194:2: iv_ruleTopology= ruleTopology EOF
            {
             newCompositeNode(grammarAccess.getTopologyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTopology=ruleTopology();

            state._fsp--;

             current =iv_ruleTopology; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTopology"


    // $ANTLR start "ruleTopology"
    // InternalDsl.g:200:1: ruleTopology returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_joint_1_0= ruleJointRef ) ) ( (lv_child_2_0= ruleTopology ) ) )? ) ;
    public final EObject ruleTopology() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_joint_1_0 = null;

        EObject lv_child_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:206:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_joint_1_0= ruleJointRef ) ) ( (lv_child_2_0= ruleTopology ) ) )? ) )
            // InternalDsl.g:207:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_joint_1_0= ruleJointRef ) ) ( (lv_child_2_0= ruleTopology ) ) )? )
            {
            // InternalDsl.g:207:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_joint_1_0= ruleJointRef ) ) ( (lv_child_2_0= ruleTopology ) ) )? )
            // InternalDsl.g:208:3: ( (otherlv_0= RULE_ID ) ) ( ( (lv_joint_1_0= ruleJointRef ) ) ( (lv_child_2_0= ruleTopology ) ) )?
            {
            // InternalDsl.g:208:3: ( (otherlv_0= RULE_ID ) )
            // InternalDsl.g:209:4: (otherlv_0= RULE_ID )
            {
            // InternalDsl.g:209:4: (otherlv_0= RULE_ID )
            // InternalDsl.g:210:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTopologyRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_0, grammarAccess.getTopologyAccess().getParentLinkCrossReference_0_0());
            				

            }


            }

            // InternalDsl.g:221:3: ( ( (lv_joint_1_0= ruleJointRef ) ) ( (lv_child_2_0= ruleTopology ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=20 && LA2_0<=23)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:222:4: ( (lv_joint_1_0= ruleJointRef ) ) ( (lv_child_2_0= ruleTopology ) )
                    {
                    // InternalDsl.g:222:4: ( (lv_joint_1_0= ruleJointRef ) )
                    // InternalDsl.g:223:5: (lv_joint_1_0= ruleJointRef )
                    {
                    // InternalDsl.g:223:5: (lv_joint_1_0= ruleJointRef )
                    // InternalDsl.g:224:6: lv_joint_1_0= ruleJointRef
                    {

                    						newCompositeNode(grammarAccess.getTopologyAccess().getJointJointRefParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_joint_1_0=ruleJointRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTopologyRule());
                    						}
                    						set(
                    							current,
                    							"joint",
                    							lv_joint_1_0,
                    							"org.xtext.urdf.Dsl.JointRef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:241:4: ( (lv_child_2_0= ruleTopology ) )
                    // InternalDsl.g:242:5: (lv_child_2_0= ruleTopology )
                    {
                    // InternalDsl.g:242:5: (lv_child_2_0= ruleTopology )
                    // InternalDsl.g:243:6: lv_child_2_0= ruleTopology
                    {

                    						newCompositeNode(grammarAccess.getTopologyAccess().getChildTopologyParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_child_2_0=ruleTopology();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTopologyRule());
                    						}
                    						set(
                    							current,
                    							"child",
                    							lv_child_2_0,
                    							"org.xtext.urdf.Dsl.Topology");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTopology"


    // $ANTLR start "entryRuleLink"
    // InternalDsl.g:265:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalDsl.g:265:45: (iv_ruleLink= ruleLink EOF )
            // InternalDsl.g:266:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalDsl.g:272:1: ruleLink returns [EObject current=null] : (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'isReuseOf' ( (otherlv_3= RULE_ID ) ) )? ( (lv_decorator_4_0= ruleLinkDecorator ) ) ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_decorator_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:278:2: ( (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'isReuseOf' ( (otherlv_3= RULE_ID ) ) )? ( (lv_decorator_4_0= ruleLinkDecorator ) ) ) )
            // InternalDsl.g:279:2: (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'isReuseOf' ( (otherlv_3= RULE_ID ) ) )? ( (lv_decorator_4_0= ruleLinkDecorator ) ) )
            {
            // InternalDsl.g:279:2: (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'isReuseOf' ( (otherlv_3= RULE_ID ) ) )? ( (lv_decorator_4_0= ruleLinkDecorator ) ) )
            // InternalDsl.g:280:3: otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'isReuseOf' ( (otherlv_3= RULE_ID ) ) )? ( (lv_decorator_4_0= ruleLinkDecorator ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalDsl.g:284:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:285:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:285:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:286:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDsl.g:302:3: (otherlv_2= 'isReuseOf' ( (otherlv_3= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:303:4: otherlv_2= 'isReuseOf' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getIsReuseOfKeyword_2_0());
                    			
                    // InternalDsl.g:307:4: ( (otherlv_3= RULE_ID ) )
                    // InternalDsl.g:308:5: (otherlv_3= RULE_ID )
                    {
                    // InternalDsl.g:308:5: (otherlv_3= RULE_ID )
                    // InternalDsl.g:309:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLinkRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getIsReuseOfLinkCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:321:3: ( (lv_decorator_4_0= ruleLinkDecorator ) )
            // InternalDsl.g:322:4: (lv_decorator_4_0= ruleLinkDecorator )
            {
            // InternalDsl.g:322:4: (lv_decorator_4_0= ruleLinkDecorator )
            // InternalDsl.g:323:5: lv_decorator_4_0= ruleLinkDecorator
            {

            					newCompositeNode(grammarAccess.getLinkAccess().getDecoratorLinkDecoratorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_decorator_4_0=ruleLinkDecorator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinkRule());
            					}
            					set(
            						current,
            						"decorator",
            						lv_decorator_4_0,
            						"org.xtext.urdf.Dsl.LinkDecorator");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleLinkDecorator"
    // InternalDsl.g:344:1: entryRuleLinkDecorator returns [EObject current=null] : iv_ruleLinkDecorator= ruleLinkDecorator EOF ;
    public final EObject entryRuleLinkDecorator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkDecorator = null;


        try {
            // InternalDsl.g:344:54: (iv_ruleLinkDecorator= ruleLinkDecorator EOF )
            // InternalDsl.g:345:2: iv_ruleLinkDecorator= ruleLinkDecorator EOF
            {
             newCompositeNode(grammarAccess.getLinkDecoratorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinkDecorator=ruleLinkDecorator();

            state._fsp--;

             current =iv_ruleLinkDecorator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinkDecorator"


    // $ANTLR start "ruleLinkDecorator"
    // InternalDsl.g:351:1: ruleLinkDecorator returns [EObject current=null] : ( () ( (lv_inertial_1_0= ruleInertial ) )* ( (lv_visual_2_0= ruleVisual ) )* ( (lv_collision_3_0= ruleCollision ) )* ) ;
    public final EObject ruleLinkDecorator() throws RecognitionException {
        EObject current = null;

        EObject lv_inertial_1_0 = null;

        EObject lv_visual_2_0 = null;

        EObject lv_collision_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:357:2: ( ( () ( (lv_inertial_1_0= ruleInertial ) )* ( (lv_visual_2_0= ruleVisual ) )* ( (lv_collision_3_0= ruleCollision ) )* ) )
            // InternalDsl.g:358:2: ( () ( (lv_inertial_1_0= ruleInertial ) )* ( (lv_visual_2_0= ruleVisual ) )* ( (lv_collision_3_0= ruleCollision ) )* )
            {
            // InternalDsl.g:358:2: ( () ( (lv_inertial_1_0= ruleInertial ) )* ( (lv_visual_2_0= ruleVisual ) )* ( (lv_collision_3_0= ruleCollision ) )* )
            // InternalDsl.g:359:3: () ( (lv_inertial_1_0= ruleInertial ) )* ( (lv_visual_2_0= ruleVisual ) )* ( (lv_collision_3_0= ruleCollision ) )*
            {
            // InternalDsl.g:359:3: ()
            // InternalDsl.g:360:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLinkDecoratorAccess().getLinkDecoratorAction_0(),
            					current);
            			

            }

            // InternalDsl.g:366:3: ( (lv_inertial_1_0= ruleInertial ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:367:4: (lv_inertial_1_0= ruleInertial )
            	    {
            	    // InternalDsl.g:367:4: (lv_inertial_1_0= ruleInertial )
            	    // InternalDsl.g:368:5: lv_inertial_1_0= ruleInertial
            	    {

            	    					newCompositeNode(grammarAccess.getLinkDecoratorAccess().getInertialInertialParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_inertial_1_0=ruleInertial();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLinkDecoratorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"inertial",
            	    						lv_inertial_1_0,
            	    						"org.xtext.urdf.Dsl.Inertial");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalDsl.g:385:3: ( (lv_visual_2_0= ruleVisual ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==32) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:386:4: (lv_visual_2_0= ruleVisual )
            	    {
            	    // InternalDsl.g:386:4: (lv_visual_2_0= ruleVisual )
            	    // InternalDsl.g:387:5: lv_visual_2_0= ruleVisual
            	    {

            	    					newCompositeNode(grammarAccess.getLinkDecoratorAccess().getVisualVisualParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_visual_2_0=ruleVisual();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLinkDecoratorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"visual",
            	    						lv_visual_2_0,
            	    						"org.xtext.urdf.Dsl.Visual");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalDsl.g:404:3: ( (lv_collision_3_0= ruleCollision ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==43) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:405:4: (lv_collision_3_0= ruleCollision )
            	    {
            	    // InternalDsl.g:405:4: (lv_collision_3_0= ruleCollision )
            	    // InternalDsl.g:406:5: lv_collision_3_0= ruleCollision
            	    {

            	    					newCompositeNode(grammarAccess.getLinkDecoratorAccess().getCollisionCollisionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_collision_3_0=ruleCollision();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLinkDecoratorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"collision",
            	    						lv_collision_3_0,
            	    						"org.xtext.urdf.Dsl.Collision");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinkDecorator"


    // $ANTLR start "entryRuleLinkRef"
    // InternalDsl.g:427:1: entryRuleLinkRef returns [EObject current=null] : iv_ruleLinkRef= ruleLinkRef EOF ;
    public final EObject entryRuleLinkRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkRef = null;


        try {
            // InternalDsl.g:427:48: (iv_ruleLinkRef= ruleLinkRef EOF )
            // InternalDsl.g:428:2: iv_ruleLinkRef= ruleLinkRef EOF
            {
             newCompositeNode(grammarAccess.getLinkRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinkRef=ruleLinkRef();

            state._fsp--;

             current =iv_ruleLinkRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinkRef"


    // $ANTLR start "ruleLinkRef"
    // InternalDsl.g:434:1: ruleLinkRef returns [EObject current=null] : (otherlv_0= 'add_to' ( (otherlv_1= RULE_ID ) ) ( (lv_decorator_2_0= ruleLinkDecorator ) ) ) ;
    public final EObject ruleLinkRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_decorator_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:440:2: ( (otherlv_0= 'add_to' ( (otherlv_1= RULE_ID ) ) ( (lv_decorator_2_0= ruleLinkDecorator ) ) ) )
            // InternalDsl.g:441:2: (otherlv_0= 'add_to' ( (otherlv_1= RULE_ID ) ) ( (lv_decorator_2_0= ruleLinkDecorator ) ) )
            {
            // InternalDsl.g:441:2: (otherlv_0= 'add_to' ( (otherlv_1= RULE_ID ) ) ( (lv_decorator_2_0= ruleLinkDecorator ) ) )
            // InternalDsl.g:442:3: otherlv_0= 'add_to' ( (otherlv_1= RULE_ID ) ) ( (lv_decorator_2_0= ruleLinkDecorator ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkRefAccess().getAdd_toKeyword_0());
            		
            // InternalDsl.g:446:3: ( (otherlv_1= RULE_ID ) )
            // InternalDsl.g:447:4: (otherlv_1= RULE_ID )
            {
            // InternalDsl.g:447:4: (otherlv_1= RULE_ID )
            // InternalDsl.g:448:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRefRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_1, grammarAccess.getLinkRefAccess().getRefLinkCrossReference_1_0());
            				

            }


            }

            // InternalDsl.g:459:3: ( (lv_decorator_2_0= ruleLinkDecorator ) )
            // InternalDsl.g:460:4: (lv_decorator_2_0= ruleLinkDecorator )
            {
            // InternalDsl.g:460:4: (lv_decorator_2_0= ruleLinkDecorator )
            // InternalDsl.g:461:5: lv_decorator_2_0= ruleLinkDecorator
            {

            					newCompositeNode(grammarAccess.getLinkRefAccess().getDecoratorLinkDecoratorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_decorator_2_0=ruleLinkDecorator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinkRefRule());
            					}
            					set(
            						current,
            						"decorator",
            						lv_decorator_2_0,
            						"org.xtext.urdf.Dsl.LinkDecorator");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinkRef"


    // $ANTLR start "entryRuleJoint"
    // InternalDsl.g:482:1: entryRuleJoint returns [EObject current=null] : iv_ruleJoint= ruleJoint EOF ;
    public final EObject entryRuleJoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoint = null;


        try {
            // InternalDsl.g:482:46: (iv_ruleJoint= ruleJoint EOF )
            // InternalDsl.g:483:2: iv_ruleJoint= ruleJoint EOF
            {
             newCompositeNode(grammarAccess.getJointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJoint=ruleJoint();

            state._fsp--;

             current =iv_ruleJoint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoint"


    // $ANTLR start "ruleJoint"
    // InternalDsl.g:489:1: ruleJoint returns [EObject current=null] : (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ChildOf' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'ParentOf' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'Type' ( (lv_Type_7_0= ruleJointType ) ) (otherlv_8= 'isReuseOf' ( (otherlv_9= RULE_ID ) ) )? ( (lv_decorator_10_0= ruleJointDecorator ) ) ) ;
    public final EObject ruleJoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Enumerator lv_Type_7_0 = null;

        EObject lv_decorator_10_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:495:2: ( (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ChildOf' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'ParentOf' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'Type' ( (lv_Type_7_0= ruleJointType ) ) (otherlv_8= 'isReuseOf' ( (otherlv_9= RULE_ID ) ) )? ( (lv_decorator_10_0= ruleJointDecorator ) ) ) )
            // InternalDsl.g:496:2: (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ChildOf' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'ParentOf' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'Type' ( (lv_Type_7_0= ruleJointType ) ) (otherlv_8= 'isReuseOf' ( (otherlv_9= RULE_ID ) ) )? ( (lv_decorator_10_0= ruleJointDecorator ) ) )
            {
            // InternalDsl.g:496:2: (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ChildOf' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'ParentOf' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'Type' ( (lv_Type_7_0= ruleJointType ) ) (otherlv_8= 'isReuseOf' ( (otherlv_9= RULE_ID ) ) )? ( (lv_decorator_10_0= ruleJointDecorator ) ) )
            // InternalDsl.g:497:3: otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ChildOf' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'ParentOf' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'Type' ( (lv_Type_7_0= ruleJointType ) ) (otherlv_8= 'isReuseOf' ( (otherlv_9= RULE_ID ) ) )? ( (lv_decorator_10_0= ruleJointDecorator ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJointAccess().getJointKeyword_0());
            		
            // InternalDsl.g:501:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:502:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:502:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:503:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJointAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getJointAccess().getChildOfKeyword_2());
            		
            // InternalDsl.g:523:3: ( (otherlv_3= RULE_ID ) )
            // InternalDsl.g:524:4: (otherlv_3= RULE_ID )
            {
            // InternalDsl.g:524:4: (otherlv_3= RULE_ID )
            // InternalDsl.g:525:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getJointAccess().getChildOfLinkCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getJointAccess().getParentOfKeyword_4());
            		
            // InternalDsl.g:540:3: ( (otherlv_5= RULE_ID ) )
            // InternalDsl.g:541:4: (otherlv_5= RULE_ID )
            {
            // InternalDsl.g:541:4: (otherlv_5= RULE_ID )
            // InternalDsl.g:542:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_5, grammarAccess.getJointAccess().getParentOfLinkCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getJointAccess().getTypeKeyword_6());
            		
            // InternalDsl.g:557:3: ( (lv_Type_7_0= ruleJointType ) )
            // InternalDsl.g:558:4: (lv_Type_7_0= ruleJointType )
            {
            // InternalDsl.g:558:4: (lv_Type_7_0= ruleJointType )
            // InternalDsl.g:559:5: lv_Type_7_0= ruleJointType
            {

            					newCompositeNode(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_15);
            lv_Type_7_0=ruleJointType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointRule());
            					}
            					set(
            						current,
            						"Type",
            						lv_Type_7_0,
            						"org.xtext.urdf.Dsl.JointType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:576:3: (otherlv_8= 'isReuseOf' ( (otherlv_9= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:577:4: otherlv_8= 'isReuseOf' ( (otherlv_9= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getJointAccess().getIsReuseOfKeyword_8_0());
                    			
                    // InternalDsl.g:581:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDsl.g:582:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDsl.g:582:5: (otherlv_9= RULE_ID )
                    // InternalDsl.g:583:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJointRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_9, grammarAccess.getJointAccess().getIsReuseOfJointCrossReference_8_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:595:3: ( (lv_decorator_10_0= ruleJointDecorator ) )
            // InternalDsl.g:596:4: (lv_decorator_10_0= ruleJointDecorator )
            {
            // InternalDsl.g:596:4: (lv_decorator_10_0= ruleJointDecorator )
            // InternalDsl.g:597:5: lv_decorator_10_0= ruleJointDecorator
            {

            					newCompositeNode(grammarAccess.getJointAccess().getDecoratorJointDecoratorParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_decorator_10_0=ruleJointDecorator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointRule());
            					}
            					set(
            						current,
            						"decorator",
            						lv_decorator_10_0,
            						"org.xtext.urdf.Dsl.JointDecorator");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoint"


    // $ANTLR start "entryRuleJointDecorator"
    // InternalDsl.g:618:1: entryRuleJointDecorator returns [EObject current=null] : iv_ruleJointDecorator= ruleJointDecorator EOF ;
    public final EObject entryRuleJointDecorator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJointDecorator = null;


        try {
            // InternalDsl.g:618:55: (iv_ruleJointDecorator= ruleJointDecorator EOF )
            // InternalDsl.g:619:2: iv_ruleJointDecorator= ruleJointDecorator EOF
            {
             newCompositeNode(grammarAccess.getJointDecoratorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJointDecorator=ruleJointDecorator();

            state._fsp--;

             current =iv_ruleJointDecorator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJointDecorator"


    // $ANTLR start "ruleJointDecorator"
    // InternalDsl.g:625:1: ruleJointDecorator returns [EObject current=null] : ( () ( (lv_limit_1_0= ruleLimit ) )? ( (lv_axis_2_0= ruleAxis ) )? ( (lv_calibration_3_0= ruleCalibration ) )? ( (lv_dynamics_4_0= ruleDynamics ) )? ( (lv_safetycontroller_5_0= ruleSafetyController ) )? ) ;
    public final EObject ruleJointDecorator() throws RecognitionException {
        EObject current = null;

        EObject lv_limit_1_0 = null;

        EObject lv_axis_2_0 = null;

        EObject lv_calibration_3_0 = null;

        EObject lv_dynamics_4_0 = null;

        EObject lv_safetycontroller_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:631:2: ( ( () ( (lv_limit_1_0= ruleLimit ) )? ( (lv_axis_2_0= ruleAxis ) )? ( (lv_calibration_3_0= ruleCalibration ) )? ( (lv_dynamics_4_0= ruleDynamics ) )? ( (lv_safetycontroller_5_0= ruleSafetyController ) )? ) )
            // InternalDsl.g:632:2: ( () ( (lv_limit_1_0= ruleLimit ) )? ( (lv_axis_2_0= ruleAxis ) )? ( (lv_calibration_3_0= ruleCalibration ) )? ( (lv_dynamics_4_0= ruleDynamics ) )? ( (lv_safetycontroller_5_0= ruleSafetyController ) )? )
            {
            // InternalDsl.g:632:2: ( () ( (lv_limit_1_0= ruleLimit ) )? ( (lv_axis_2_0= ruleAxis ) )? ( (lv_calibration_3_0= ruleCalibration ) )? ( (lv_dynamics_4_0= ruleDynamics ) )? ( (lv_safetycontroller_5_0= ruleSafetyController ) )? )
            // InternalDsl.g:633:3: () ( (lv_limit_1_0= ruleLimit ) )? ( (lv_axis_2_0= ruleAxis ) )? ( (lv_calibration_3_0= ruleCalibration ) )? ( (lv_dynamics_4_0= ruleDynamics ) )? ( (lv_safetycontroller_5_0= ruleSafetyController ) )?
            {
            // InternalDsl.g:633:3: ()
            // InternalDsl.g:634:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJointDecoratorAccess().getJointDecoratorAction_0(),
            					current);
            			

            }

            // InternalDsl.g:640:3: ( (lv_limit_1_0= ruleLimit ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==59) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:641:4: (lv_limit_1_0= ruleLimit )
                    {
                    // InternalDsl.g:641:4: (lv_limit_1_0= ruleLimit )
                    // InternalDsl.g:642:5: lv_limit_1_0= ruleLimit
                    {

                    					newCompositeNode(grammarAccess.getJointDecoratorAccess().getLimitLimitParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_limit_1_0=ruleLimit();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getJointDecoratorRule());
                    					}
                    					set(
                    						current,
                    						"limit",
                    						lv_limit_1_0,
                    						"org.xtext.urdf.Dsl.Limit");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:659:3: ( (lv_axis_2_0= ruleAxis ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==64) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:660:4: (lv_axis_2_0= ruleAxis )
                    {
                    // InternalDsl.g:660:4: (lv_axis_2_0= ruleAxis )
                    // InternalDsl.g:661:5: lv_axis_2_0= ruleAxis
                    {

                    					newCompositeNode(grammarAccess.getJointDecoratorAccess().getAxisAxisParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_axis_2_0=ruleAxis();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getJointDecoratorRule());
                    					}
                    					set(
                    						current,
                    						"axis",
                    						lv_axis_2_0,
                    						"org.xtext.urdf.Dsl.Axis");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:678:3: ( (lv_calibration_3_0= ruleCalibration ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==65) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:679:4: (lv_calibration_3_0= ruleCalibration )
                    {
                    // InternalDsl.g:679:4: (lv_calibration_3_0= ruleCalibration )
                    // InternalDsl.g:680:5: lv_calibration_3_0= ruleCalibration
                    {

                    					newCompositeNode(grammarAccess.getJointDecoratorAccess().getCalibrationCalibrationParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_19);
                    lv_calibration_3_0=ruleCalibration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getJointDecoratorRule());
                    					}
                    					set(
                    						current,
                    						"calibration",
                    						lv_calibration_3_0,
                    						"org.xtext.urdf.Dsl.Calibration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:697:3: ( (lv_dynamics_4_0= ruleDynamics ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==68) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:698:4: (lv_dynamics_4_0= ruleDynamics )
                    {
                    // InternalDsl.g:698:4: (lv_dynamics_4_0= ruleDynamics )
                    // InternalDsl.g:699:5: lv_dynamics_4_0= ruleDynamics
                    {

                    					newCompositeNode(grammarAccess.getJointDecoratorAccess().getDynamicsDynamicsParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_dynamics_4_0=ruleDynamics();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getJointDecoratorRule());
                    					}
                    					set(
                    						current,
                    						"dynamics",
                    						lv_dynamics_4_0,
                    						"org.xtext.urdf.Dsl.Dynamics");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:716:3: ( (lv_safetycontroller_5_0= ruleSafetyController ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==71) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:717:4: (lv_safetycontroller_5_0= ruleSafetyController )
                    {
                    // InternalDsl.g:717:4: (lv_safetycontroller_5_0= ruleSafetyController )
                    // InternalDsl.g:718:5: lv_safetycontroller_5_0= ruleSafetyController
                    {

                    					newCompositeNode(grammarAccess.getJointDecoratorAccess().getSafetycontrollerSafetyControllerParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_safetycontroller_5_0=ruleSafetyController();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getJointDecoratorRule());
                    					}
                    					set(
                    						current,
                    						"safetycontroller",
                    						lv_safetycontroller_5_0,
                    						"org.xtext.urdf.Dsl.SafetyController");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJointDecorator"


    // $ANTLR start "entryRuleJointRef"
    // InternalDsl.g:739:1: entryRuleJointRef returns [EObject current=null] : iv_ruleJointRef= ruleJointRef EOF ;
    public final EObject entryRuleJointRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJointRef = null;


        try {
            // InternalDsl.g:739:49: (iv_ruleJointRef= ruleJointRef EOF )
            // InternalDsl.g:740:2: iv_ruleJointRef= ruleJointRef EOF
            {
             newCompositeNode(grammarAccess.getJointRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJointRef=ruleJointRef();

            state._fsp--;

             current =iv_ruleJointRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJointRef"


    // $ANTLR start "ruleJointRef"
    // InternalDsl.g:746:1: ruleJointRef returns [EObject current=null] : ( ( (lv_fix_0_0= '->' ) ) | ( (lv_rev_1_0= 'r->' ) ) | ( (lv_pris_2_0= 'p->' ) ) | ( (lv_cont_3_0= 'c->' ) ) ) ;
    public final EObject ruleJointRef() throws RecognitionException {
        EObject current = null;

        Token lv_fix_0_0=null;
        Token lv_rev_1_0=null;
        Token lv_pris_2_0=null;
        Token lv_cont_3_0=null;


        	enterRule();

        try {
            // InternalDsl.g:752:2: ( ( ( (lv_fix_0_0= '->' ) ) | ( (lv_rev_1_0= 'r->' ) ) | ( (lv_pris_2_0= 'p->' ) ) | ( (lv_cont_3_0= 'c->' ) ) ) )
            // InternalDsl.g:753:2: ( ( (lv_fix_0_0= '->' ) ) | ( (lv_rev_1_0= 'r->' ) ) | ( (lv_pris_2_0= 'p->' ) ) | ( (lv_cont_3_0= 'c->' ) ) )
            {
            // InternalDsl.g:753:2: ( ( (lv_fix_0_0= '->' ) ) | ( (lv_rev_1_0= 'r->' ) ) | ( (lv_pris_2_0= 'p->' ) ) | ( (lv_cont_3_0= 'c->' ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt13=1;
                }
                break;
            case 21:
                {
                alt13=2;
                }
                break;
            case 22:
                {
                alt13=3;
                }
                break;
            case 23:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalDsl.g:754:3: ( (lv_fix_0_0= '->' ) )
                    {
                    // InternalDsl.g:754:3: ( (lv_fix_0_0= '->' ) )
                    // InternalDsl.g:755:4: (lv_fix_0_0= '->' )
                    {
                    // InternalDsl.g:755:4: (lv_fix_0_0= '->' )
                    // InternalDsl.g:756:5: lv_fix_0_0= '->'
                    {
                    lv_fix_0_0=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_fix_0_0, grammarAccess.getJointRefAccess().getFixHyphenMinusGreaterThanSignKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJointRefRule());
                    					}
                    					setWithLastConsumed(current, "fix", lv_fix_0_0, "->");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:769:3: ( (lv_rev_1_0= 'r->' ) )
                    {
                    // InternalDsl.g:769:3: ( (lv_rev_1_0= 'r->' ) )
                    // InternalDsl.g:770:4: (lv_rev_1_0= 'r->' )
                    {
                    // InternalDsl.g:770:4: (lv_rev_1_0= 'r->' )
                    // InternalDsl.g:771:5: lv_rev_1_0= 'r->'
                    {
                    lv_rev_1_0=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_rev_1_0, grammarAccess.getJointRefAccess().getRevRKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJointRefRule());
                    					}
                    					setWithLastConsumed(current, "rev", lv_rev_1_0, "r->");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:784:3: ( (lv_pris_2_0= 'p->' ) )
                    {
                    // InternalDsl.g:784:3: ( (lv_pris_2_0= 'p->' ) )
                    // InternalDsl.g:785:4: (lv_pris_2_0= 'p->' )
                    {
                    // InternalDsl.g:785:4: (lv_pris_2_0= 'p->' )
                    // InternalDsl.g:786:5: lv_pris_2_0= 'p->'
                    {
                    lv_pris_2_0=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_pris_2_0, grammarAccess.getJointRefAccess().getPrisPKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJointRefRule());
                    					}
                    					setWithLastConsumed(current, "pris", lv_pris_2_0, "p->");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:799:3: ( (lv_cont_3_0= 'c->' ) )
                    {
                    // InternalDsl.g:799:3: ( (lv_cont_3_0= 'c->' ) )
                    // InternalDsl.g:800:4: (lv_cont_3_0= 'c->' )
                    {
                    // InternalDsl.g:800:4: (lv_cont_3_0= 'c->' )
                    // InternalDsl.g:801:5: lv_cont_3_0= 'c->'
                    {
                    lv_cont_3_0=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_cont_3_0, grammarAccess.getJointRefAccess().getContCKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJointRefRule());
                    					}
                    					setWithLastConsumed(current, "cont", lv_cont_3_0, "c->");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJointRef"


    // $ANTLR start "entryRuleInertial"
    // InternalDsl.g:817:1: entryRuleInertial returns [EObject current=null] : iv_ruleInertial= ruleInertial EOF ;
    public final EObject entryRuleInertial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertial = null;


        try {
            // InternalDsl.g:817:49: (iv_ruleInertial= ruleInertial EOF )
            // InternalDsl.g:818:2: iv_ruleInertial= ruleInertial EOF
            {
             newCompositeNode(grammarAccess.getInertialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInertial=ruleInertial();

            state._fsp--;

             current =iv_ruleInertial; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInertial"


    // $ANTLR start "ruleInertial"
    // InternalDsl.g:824:1: ruleInertial returns [EObject current=null] : ( () otherlv_1= 'Inertial' ( (lv_name_2_0= RULE_ID ) )? ( (lv_inertia_3_0= ruleInertia ) ) ( (lv_mass_4_0= ruleMass ) ) ( (lv_origin_5_0= ruleOrigin ) )? ) ;
    public final EObject ruleInertial() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_inertia_3_0 = null;

        EObject lv_mass_4_0 = null;

        EObject lv_origin_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:830:2: ( ( () otherlv_1= 'Inertial' ( (lv_name_2_0= RULE_ID ) )? ( (lv_inertia_3_0= ruleInertia ) ) ( (lv_mass_4_0= ruleMass ) ) ( (lv_origin_5_0= ruleOrigin ) )? ) )
            // InternalDsl.g:831:2: ( () otherlv_1= 'Inertial' ( (lv_name_2_0= RULE_ID ) )? ( (lv_inertia_3_0= ruleInertia ) ) ( (lv_mass_4_0= ruleMass ) ) ( (lv_origin_5_0= ruleOrigin ) )? )
            {
            // InternalDsl.g:831:2: ( () otherlv_1= 'Inertial' ( (lv_name_2_0= RULE_ID ) )? ( (lv_inertia_3_0= ruleInertia ) ) ( (lv_mass_4_0= ruleMass ) ) ( (lv_origin_5_0= ruleOrigin ) )? )
            // InternalDsl.g:832:3: () otherlv_1= 'Inertial' ( (lv_name_2_0= RULE_ID ) )? ( (lv_inertia_3_0= ruleInertia ) ) ( (lv_mass_4_0= ruleMass ) ) ( (lv_origin_5_0= ruleOrigin ) )?
            {
            // InternalDsl.g:832:3: ()
            // InternalDsl.g:833:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInertialAccess().getInertialAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getInertialAccess().getInertialKeyword_1());
            		
            // InternalDsl.g:843:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:844:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalDsl.g:844:4: (lv_name_2_0= RULE_ID )
                    // InternalDsl.g:845:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_21); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getInertialAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInertialRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:861:3: ( (lv_inertia_3_0= ruleInertia ) )
            // InternalDsl.g:862:4: (lv_inertia_3_0= ruleInertia )
            {
            // InternalDsl.g:862:4: (lv_inertia_3_0= ruleInertia )
            // InternalDsl.g:863:5: lv_inertia_3_0= ruleInertia
            {

            					newCompositeNode(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_inertia_3_0=ruleInertia();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertialRule());
            					}
            					set(
            						current,
            						"inertia",
            						lv_inertia_3_0,
            						"org.xtext.urdf.Dsl.Inertia");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:880:3: ( (lv_mass_4_0= ruleMass ) )
            // InternalDsl.g:881:4: (lv_mass_4_0= ruleMass )
            {
            // InternalDsl.g:881:4: (lv_mass_4_0= ruleMass )
            // InternalDsl.g:882:5: lv_mass_4_0= ruleMass
            {

            					newCompositeNode(grammarAccess.getInertialAccess().getMassMassParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_mass_4_0=ruleMass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertialRule());
            					}
            					set(
            						current,
            						"mass",
            						lv_mass_4_0,
            						"org.xtext.urdf.Dsl.Mass");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:899:3: ( (lv_origin_5_0= ruleOrigin ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==44) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:900:4: (lv_origin_5_0= ruleOrigin )
                    {
                    // InternalDsl.g:900:4: (lv_origin_5_0= ruleOrigin )
                    // InternalDsl.g:901:5: lv_origin_5_0= ruleOrigin
                    {

                    					newCompositeNode(grammarAccess.getInertialAccess().getOriginOriginParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_origin_5_0=ruleOrigin();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInertialRule());
                    					}
                    					set(
                    						current,
                    						"origin",
                    						lv_origin_5_0,
                    						"org.xtext.urdf.Dsl.Origin");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInertial"


    // $ANTLR start "entryRuleInertia"
    // InternalDsl.g:922:1: entryRuleInertia returns [EObject current=null] : iv_ruleInertia= ruleInertia EOF ;
    public final EObject entryRuleInertia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertia = null;


        try {
            // InternalDsl.g:922:48: (iv_ruleInertia= ruleInertia EOF )
            // InternalDsl.g:923:2: iv_ruleInertia= ruleInertia EOF
            {
             newCompositeNode(grammarAccess.getInertiaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInertia=ruleInertia();

            state._fsp--;

             current =iv_ruleInertia; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInertia"


    // $ANTLR start "ruleInertia"
    // InternalDsl.g:929:1: ruleInertia returns [EObject current=null] : (otherlv_0= 'Inertia' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'ixx' ( (lv_ixx_3_0= ruleURDFAttrSignedNumeric ) ) otherlv_4= 'ixy' ( (lv_ixy_5_0= ruleURDFAttrSignedNumeric ) ) otherlv_6= 'ixz' ( (lv_ixz_7_0= ruleURDFAttrSignedNumeric ) ) otherlv_8= 'iyy' ( (lv_iyy_9_0= ruleURDFAttrSignedNumeric ) ) otherlv_10= 'iyz' ( (lv_iyz_11_0= ruleURDFAttrSignedNumeric ) ) otherlv_12= 'izz' ( (lv_izz_13_0= ruleURDFAttrSignedNumeric ) ) ) ;
    public final EObject ruleInertia() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_ixx_3_0 = null;

        EObject lv_ixy_5_0 = null;

        EObject lv_ixz_7_0 = null;

        EObject lv_iyy_9_0 = null;

        EObject lv_iyz_11_0 = null;

        EObject lv_izz_13_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:935:2: ( (otherlv_0= 'Inertia' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'ixx' ( (lv_ixx_3_0= ruleURDFAttrSignedNumeric ) ) otherlv_4= 'ixy' ( (lv_ixy_5_0= ruleURDFAttrSignedNumeric ) ) otherlv_6= 'ixz' ( (lv_ixz_7_0= ruleURDFAttrSignedNumeric ) ) otherlv_8= 'iyy' ( (lv_iyy_9_0= ruleURDFAttrSignedNumeric ) ) otherlv_10= 'iyz' ( (lv_iyz_11_0= ruleURDFAttrSignedNumeric ) ) otherlv_12= 'izz' ( (lv_izz_13_0= ruleURDFAttrSignedNumeric ) ) ) )
            // InternalDsl.g:936:2: (otherlv_0= 'Inertia' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'ixx' ( (lv_ixx_3_0= ruleURDFAttrSignedNumeric ) ) otherlv_4= 'ixy' ( (lv_ixy_5_0= ruleURDFAttrSignedNumeric ) ) otherlv_6= 'ixz' ( (lv_ixz_7_0= ruleURDFAttrSignedNumeric ) ) otherlv_8= 'iyy' ( (lv_iyy_9_0= ruleURDFAttrSignedNumeric ) ) otherlv_10= 'iyz' ( (lv_iyz_11_0= ruleURDFAttrSignedNumeric ) ) otherlv_12= 'izz' ( (lv_izz_13_0= ruleURDFAttrSignedNumeric ) ) )
            {
            // InternalDsl.g:936:2: (otherlv_0= 'Inertia' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'ixx' ( (lv_ixx_3_0= ruleURDFAttrSignedNumeric ) ) otherlv_4= 'ixy' ( (lv_ixy_5_0= ruleURDFAttrSignedNumeric ) ) otherlv_6= 'ixz' ( (lv_ixz_7_0= ruleURDFAttrSignedNumeric ) ) otherlv_8= 'iyy' ( (lv_iyy_9_0= ruleURDFAttrSignedNumeric ) ) otherlv_10= 'iyz' ( (lv_iyz_11_0= ruleURDFAttrSignedNumeric ) ) otherlv_12= 'izz' ( (lv_izz_13_0= ruleURDFAttrSignedNumeric ) ) )
            // InternalDsl.g:937:3: otherlv_0= 'Inertia' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'ixx' ( (lv_ixx_3_0= ruleURDFAttrSignedNumeric ) ) otherlv_4= 'ixy' ( (lv_ixy_5_0= ruleURDFAttrSignedNumeric ) ) otherlv_6= 'ixz' ( (lv_ixz_7_0= ruleURDFAttrSignedNumeric ) ) otherlv_8= 'iyy' ( (lv_iyy_9_0= ruleURDFAttrSignedNumeric ) ) otherlv_10= 'iyz' ( (lv_iyz_11_0= ruleURDFAttrSignedNumeric ) ) otherlv_12= 'izz' ( (lv_izz_13_0= ruleURDFAttrSignedNumeric ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getInertiaAccess().getInertiaKeyword_0());
            		
            // InternalDsl.g:941:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:942:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:942:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:943:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getInertiaAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInertiaRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,26,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getInertiaAccess().getIxxKeyword_2());
            		
            // InternalDsl.g:963:3: ( (lv_ixx_3_0= ruleURDFAttrSignedNumeric ) )
            // InternalDsl.g:964:4: (lv_ixx_3_0= ruleURDFAttrSignedNumeric )
            {
            // InternalDsl.g:964:4: (lv_ixx_3_0= ruleURDFAttrSignedNumeric )
            // InternalDsl.g:965:5: lv_ixx_3_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIxxURDFAttrSignedNumericParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
            lv_ixx_3_0=ruleURDFAttrSignedNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertiaRule());
            					}
            					set(
            						current,
            						"ixx",
            						lv_ixx_3_0,
            						"org.xtext.urdf.Dsl.URDFAttrSignedNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getInertiaAccess().getIxyKeyword_4());
            		
            // InternalDsl.g:986:3: ( (lv_ixy_5_0= ruleURDFAttrSignedNumeric ) )
            // InternalDsl.g:987:4: (lv_ixy_5_0= ruleURDFAttrSignedNumeric )
            {
            // InternalDsl.g:987:4: (lv_ixy_5_0= ruleURDFAttrSignedNumeric )
            // InternalDsl.g:988:5: lv_ixy_5_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIxyURDFAttrSignedNumericParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_28);
            lv_ixy_5_0=ruleURDFAttrSignedNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertiaRule());
            					}
            					set(
            						current,
            						"ixy",
            						lv_ixy_5_0,
            						"org.xtext.urdf.Dsl.URDFAttrSignedNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_26); 

            			newLeafNode(otherlv_6, grammarAccess.getInertiaAccess().getIxzKeyword_6());
            		
            // InternalDsl.g:1009:3: ( (lv_ixz_7_0= ruleURDFAttrSignedNumeric ) )
            // InternalDsl.g:1010:4: (lv_ixz_7_0= ruleURDFAttrSignedNumeric )
            {
            // InternalDsl.g:1010:4: (lv_ixz_7_0= ruleURDFAttrSignedNumeric )
            // InternalDsl.g:1011:5: lv_ixz_7_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIxzURDFAttrSignedNumericParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_29);
            lv_ixz_7_0=ruleURDFAttrSignedNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertiaRule());
            					}
            					set(
            						current,
            						"ixz",
            						lv_ixz_7_0,
            						"org.xtext.urdf.Dsl.URDFAttrSignedNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_26); 

            			newLeafNode(otherlv_8, grammarAccess.getInertiaAccess().getIyyKeyword_8());
            		
            // InternalDsl.g:1032:3: ( (lv_iyy_9_0= ruleURDFAttrSignedNumeric ) )
            // InternalDsl.g:1033:4: (lv_iyy_9_0= ruleURDFAttrSignedNumeric )
            {
            // InternalDsl.g:1033:4: (lv_iyy_9_0= ruleURDFAttrSignedNumeric )
            // InternalDsl.g:1034:5: lv_iyy_9_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIyyURDFAttrSignedNumericParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_30);
            lv_iyy_9_0=ruleURDFAttrSignedNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertiaRule());
            					}
            					set(
            						current,
            						"iyy",
            						lv_iyy_9_0,
            						"org.xtext.urdf.Dsl.URDFAttrSignedNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,30,FOLLOW_26); 

            			newLeafNode(otherlv_10, grammarAccess.getInertiaAccess().getIyzKeyword_10());
            		
            // InternalDsl.g:1055:3: ( (lv_iyz_11_0= ruleURDFAttrSignedNumeric ) )
            // InternalDsl.g:1056:4: (lv_iyz_11_0= ruleURDFAttrSignedNumeric )
            {
            // InternalDsl.g:1056:4: (lv_iyz_11_0= ruleURDFAttrSignedNumeric )
            // InternalDsl.g:1057:5: lv_iyz_11_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIyzURDFAttrSignedNumericParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_31);
            lv_iyz_11_0=ruleURDFAttrSignedNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertiaRule());
            					}
            					set(
            						current,
            						"iyz",
            						lv_iyz_11_0,
            						"org.xtext.urdf.Dsl.URDFAttrSignedNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,31,FOLLOW_26); 

            			newLeafNode(otherlv_12, grammarAccess.getInertiaAccess().getIzzKeyword_12());
            		
            // InternalDsl.g:1078:3: ( (lv_izz_13_0= ruleURDFAttrSignedNumeric ) )
            // InternalDsl.g:1079:4: (lv_izz_13_0= ruleURDFAttrSignedNumeric )
            {
            // InternalDsl.g:1079:4: (lv_izz_13_0= ruleURDFAttrSignedNumeric )
            // InternalDsl.g:1080:5: lv_izz_13_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIzzURDFAttrSignedNumericParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_2);
            lv_izz_13_0=ruleURDFAttrSignedNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertiaRule());
            					}
            					set(
            						current,
            						"izz",
            						lv_izz_13_0,
            						"org.xtext.urdf.Dsl.URDFAttrSignedNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInertia"


    // $ANTLR start "entryRuleVisual"
    // InternalDsl.g:1101:1: entryRuleVisual returns [EObject current=null] : iv_ruleVisual= ruleVisual EOF ;
    public final EObject entryRuleVisual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisual = null;


        try {
            // InternalDsl.g:1101:47: (iv_ruleVisual= ruleVisual EOF )
            // InternalDsl.g:1102:2: iv_ruleVisual= ruleVisual EOF
            {
             newCompositeNode(grammarAccess.getVisualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVisual=ruleVisual();

            state._fsp--;

             current =iv_ruleVisual; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVisual"


    // $ANTLR start "ruleVisual"
    // InternalDsl.g:1108:1: ruleVisual returns [EObject current=null] : ( () otherlv_1= 'Visual' ( (lv_name_2_0= RULE_ID ) )? ( (lv_geometry_3_0= ruleGeometry ) )* ( (lv_origin_4_0= ruleOrigin ) )? ) ;
    public final EObject ruleVisual() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_geometry_3_0 = null;

        EObject lv_origin_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1114:2: ( ( () otherlv_1= 'Visual' ( (lv_name_2_0= RULE_ID ) )? ( (lv_geometry_3_0= ruleGeometry ) )* ( (lv_origin_4_0= ruleOrigin ) )? ) )
            // InternalDsl.g:1115:2: ( () otherlv_1= 'Visual' ( (lv_name_2_0= RULE_ID ) )? ( (lv_geometry_3_0= ruleGeometry ) )* ( (lv_origin_4_0= ruleOrigin ) )? )
            {
            // InternalDsl.g:1115:2: ( () otherlv_1= 'Visual' ( (lv_name_2_0= RULE_ID ) )? ( (lv_geometry_3_0= ruleGeometry ) )* ( (lv_origin_4_0= ruleOrigin ) )? )
            // InternalDsl.g:1116:3: () otherlv_1= 'Visual' ( (lv_name_2_0= RULE_ID ) )? ( (lv_geometry_3_0= ruleGeometry ) )* ( (lv_origin_4_0= ruleOrigin ) )?
            {
            // InternalDsl.g:1116:3: ()
            // InternalDsl.g:1117:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVisualAccess().getVisualAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getVisualAccess().getVisualKeyword_1());
            		
            // InternalDsl.g:1127:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:1128:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalDsl.g:1128:4: (lv_name_2_0= RULE_ID )
                    // InternalDsl.g:1129:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_33); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getVisualAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVisualRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:1145:3: ( (lv_geometry_3_0= ruleGeometry ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==33||LA18_0==37||LA18_0==39||LA18_0==42) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDsl.g:1146:4: (lv_geometry_3_0= ruleGeometry )
            	    {
            	    // InternalDsl.g:1146:4: (lv_geometry_3_0= ruleGeometry )
            	    // InternalDsl.g:1147:5: lv_geometry_3_0= ruleGeometry
            	    {

            	    					newCompositeNode(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_geometry_3_0=ruleGeometry();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVisualRule());
            	    					}
            	    					add(
            	    						current,
            	    						"geometry",
            	    						lv_geometry_3_0,
            	    						"org.xtext.urdf.Dsl.Geometry");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalDsl.g:1164:3: ( (lv_origin_4_0= ruleOrigin ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==44) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDsl.g:1165:4: (lv_origin_4_0= ruleOrigin )
                    {
                    // InternalDsl.g:1165:4: (lv_origin_4_0= ruleOrigin )
                    // InternalDsl.g:1166:5: lv_origin_4_0= ruleOrigin
                    {

                    					newCompositeNode(grammarAccess.getVisualAccess().getOriginOriginParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_origin_4_0=ruleOrigin();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVisualRule());
                    					}
                    					set(
                    						current,
                    						"origin",
                    						lv_origin_4_0,
                    						"org.xtext.urdf.Dsl.Origin");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisual"


    // $ANTLR start "entryRuleGeometry"
    // InternalDsl.g:1187:1: entryRuleGeometry returns [EObject current=null] : iv_ruleGeometry= ruleGeometry EOF ;
    public final EObject entryRuleGeometry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeometry = null;


        try {
            // InternalDsl.g:1187:49: (iv_ruleGeometry= ruleGeometry EOF )
            // InternalDsl.g:1188:2: iv_ruleGeometry= ruleGeometry EOF
            {
             newCompositeNode(grammarAccess.getGeometryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeometry=ruleGeometry();

            state._fsp--;

             current =iv_ruleGeometry; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeometry"


    // $ANTLR start "ruleGeometry"
    // InternalDsl.g:1194:1: ruleGeometry returns [EObject current=null] : (this_Box_0= ruleBox | this_Cylinder_1= ruleCylinder | this_Mesh_2= ruleMesh | this_Sphere_3= ruleSphere ) ;
    public final EObject ruleGeometry() throws RecognitionException {
        EObject current = null;

        EObject this_Box_0 = null;

        EObject this_Cylinder_1 = null;

        EObject this_Mesh_2 = null;

        EObject this_Sphere_3 = null;



        	enterRule();

        try {
            // InternalDsl.g:1200:2: ( (this_Box_0= ruleBox | this_Cylinder_1= ruleCylinder | this_Mesh_2= ruleMesh | this_Sphere_3= ruleSphere ) )
            // InternalDsl.g:1201:2: (this_Box_0= ruleBox | this_Cylinder_1= ruleCylinder | this_Mesh_2= ruleMesh | this_Sphere_3= ruleSphere )
            {
            // InternalDsl.g:1201:2: (this_Box_0= ruleBox | this_Cylinder_1= ruleCylinder | this_Mesh_2= ruleMesh | this_Sphere_3= ruleSphere )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt20=1;
                }
                break;
            case 37:
                {
                alt20=2;
                }
                break;
            case 39:
                {
                alt20=3;
                }
                break;
            case 42:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalDsl.g:1202:3: this_Box_0= ruleBox
                    {

                    			newCompositeNode(grammarAccess.getGeometryAccess().getBoxParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Box_0=ruleBox();

                    state._fsp--;


                    			current = this_Box_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1211:3: this_Cylinder_1= ruleCylinder
                    {

                    			newCompositeNode(grammarAccess.getGeometryAccess().getCylinderParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Cylinder_1=ruleCylinder();

                    state._fsp--;


                    			current = this_Cylinder_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:1220:3: this_Mesh_2= ruleMesh
                    {

                    			newCompositeNode(grammarAccess.getGeometryAccess().getMeshParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mesh_2=ruleMesh();

                    state._fsp--;


                    			current = this_Mesh_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDsl.g:1229:3: this_Sphere_3= ruleSphere
                    {

                    			newCompositeNode(grammarAccess.getGeometryAccess().getSphereParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sphere_3=ruleSphere();

                    state._fsp--;


                    			current = this_Sphere_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeometry"


    // $ANTLR start "entryRuleBox"
    // InternalDsl.g:1241:1: entryRuleBox returns [EObject current=null] : iv_ruleBox= ruleBox EOF ;
    public final EObject entryRuleBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBox = null;


        try {
            // InternalDsl.g:1241:44: (iv_ruleBox= ruleBox EOF )
            // InternalDsl.g:1242:2: iv_ruleBox= ruleBox EOF
            {
             newCompositeNode(grammarAccess.getBoxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBox=ruleBox();

            state._fsp--;

             current =iv_ruleBox; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBox"


    // $ANTLR start "ruleBox"
    // InternalDsl.g:1248:1: ruleBox returns [EObject current=null] : (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'height' ( (lv_height_3_0= ruleURDFAttrNumeric ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleURDFAttrNumeric ) ) otherlv_6= 'width' ( (lv_width_7_0= ruleURDFAttrNumeric ) ) ) ;
    public final EObject ruleBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_height_3_0 = null;

        EObject lv_length_5_0 = null;

        EObject lv_width_7_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1254:2: ( (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'height' ( (lv_height_3_0= ruleURDFAttrNumeric ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleURDFAttrNumeric ) ) otherlv_6= 'width' ( (lv_width_7_0= ruleURDFAttrNumeric ) ) ) )
            // InternalDsl.g:1255:2: (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'height' ( (lv_height_3_0= ruleURDFAttrNumeric ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleURDFAttrNumeric ) ) otherlv_6= 'width' ( (lv_width_7_0= ruleURDFAttrNumeric ) ) )
            {
            // InternalDsl.g:1255:2: (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'height' ( (lv_height_3_0= ruleURDFAttrNumeric ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleURDFAttrNumeric ) ) otherlv_6= 'width' ( (lv_width_7_0= ruleURDFAttrNumeric ) ) )
            // InternalDsl.g:1256:3: otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'height' ( (lv_height_3_0= ruleURDFAttrNumeric ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleURDFAttrNumeric ) ) otherlv_6= 'width' ( (lv_width_7_0= ruleURDFAttrNumeric ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getBoxAccess().getBoxKeyword_0());
            		
            // InternalDsl.g:1260:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDsl.g:1261:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:1261:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:1262:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_35); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getBoxAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBoxRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,34,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getBoxAccess().getHeightKeyword_2());
            		
            // InternalDsl.g:1282:3: ( (lv_height_3_0= ruleURDFAttrNumeric ) )
            // InternalDsl.g:1283:4: (lv_height_3_0= ruleURDFAttrNumeric )
            {
            // InternalDsl.g:1283:4: (lv_height_3_0= ruleURDFAttrNumeric )
            // InternalDsl.g:1284:5: lv_height_3_0= ruleURDFAttrNumeric
            {

            					newCompositeNode(grammarAccess.getBoxAccess().getHeightURDFAttrNumericParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_36);
            lv_height_3_0=ruleURDFAttrNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoxRule());
            					}
            					set(
            						current,
            						"height",
            						lv_height_3_0,
            						"org.xtext.urdf.Dsl.URDFAttrNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,35,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getBoxAccess().getLengthKeyword_4());
            		
            // InternalDsl.g:1305:3: ( (lv_length_5_0= ruleURDFAttrNumeric ) )
            // InternalDsl.g:1306:4: (lv_length_5_0= ruleURDFAttrNumeric )
            {
            // InternalDsl.g:1306:4: (lv_length_5_0= ruleURDFAttrNumeric )
            // InternalDsl.g:1307:5: lv_length_5_0= ruleURDFAttrNumeric
            {

            					newCompositeNode(grammarAccess.getBoxAccess().getLengthURDFAttrNumericParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_37);
            lv_length_5_0=ruleURDFAttrNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoxRule());
            					}
            					set(
            						current,
            						"length",
            						lv_length_5_0,
            						"org.xtext.urdf.Dsl.URDFAttrNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,36,FOLLOW_26); 

            			newLeafNode(otherlv_6, grammarAccess.getBoxAccess().getWidthKeyword_6());
            		
            // InternalDsl.g:1328:3: ( (lv_width_7_0= ruleURDFAttrNumeric ) )
            // InternalDsl.g:1329:4: (lv_width_7_0= ruleURDFAttrNumeric )
            {
            // InternalDsl.g:1329:4: (lv_width_7_0= ruleURDFAttrNumeric )
            // InternalDsl.g:1330:5: lv_width_7_0= ruleURDFAttrNumeric
            {

            					newCompositeNode(grammarAccess.getBoxAccess().getWidthURDFAttrNumericParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_width_7_0=ruleURDFAttrNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoxRule());
            					}
            					set(
            						current,
            						"width",
            						lv_width_7_0,
            						"org.xtext.urdf.Dsl.URDFAttrNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBox"


    // $ANTLR start "entryRuleCylinder"
    // InternalDsl.g:1351:1: entryRuleCylinder returns [EObject current=null] : iv_ruleCylinder= ruleCylinder EOF ;
    public final EObject entryRuleCylinder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCylinder = null;


        try {
            // InternalDsl.g:1351:49: (iv_ruleCylinder= ruleCylinder EOF )
            // InternalDsl.g:1352:2: iv_ruleCylinder= ruleCylinder EOF
            {
             newCompositeNode(grammarAccess.getCylinderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCylinder=ruleCylinder();

            state._fsp--;

             current =iv_ruleCylinder; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCylinder"


    // $ANTLR start "ruleCylinder"
    // InternalDsl.g:1358:1: ruleCylinder returns [EObject current=null] : (otherlv_0= 'Cylinder' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleURDFAttrNumeric ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleURDFAttrNumeric ) ) ) ;
    public final EObject ruleCylinder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_radius_3_0 = null;

        EObject lv_length_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1364:2: ( (otherlv_0= 'Cylinder' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleURDFAttrNumeric ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleURDFAttrNumeric ) ) ) )
            // InternalDsl.g:1365:2: (otherlv_0= 'Cylinder' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleURDFAttrNumeric ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleURDFAttrNumeric ) ) )
            {
            // InternalDsl.g:1365:2: (otherlv_0= 'Cylinder' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleURDFAttrNumeric ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleURDFAttrNumeric ) ) )
            // InternalDsl.g:1366:3: otherlv_0= 'Cylinder' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleURDFAttrNumeric ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleURDFAttrNumeric ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getCylinderAccess().getCylinderKeyword_0());
            		
            // InternalDsl.g:1370:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:1371:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:1371:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:1372:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_39); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getCylinderAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCylinderRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,38,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getCylinderAccess().getRadiusKeyword_2());
            		
            // InternalDsl.g:1392:3: ( (lv_radius_3_0= ruleURDFAttrNumeric ) )
            // InternalDsl.g:1393:4: (lv_radius_3_0= ruleURDFAttrNumeric )
            {
            // InternalDsl.g:1393:4: (lv_radius_3_0= ruleURDFAttrNumeric )
            // InternalDsl.g:1394:5: lv_radius_3_0= ruleURDFAttrNumeric
            {

            					newCompositeNode(grammarAccess.getCylinderAccess().getRadiusURDFAttrNumericParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_36);
            lv_radius_3_0=ruleURDFAttrNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCylinderRule());
            					}
            					set(
            						current,
            						"radius",
            						lv_radius_3_0,
            						"org.xtext.urdf.Dsl.URDFAttrNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,35,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getCylinderAccess().getLengthKeyword_4());
            		
            // InternalDsl.g:1415:3: ( (lv_length_5_0= ruleURDFAttrNumeric ) )
            // InternalDsl.g:1416:4: (lv_length_5_0= ruleURDFAttrNumeric )
            {
            // InternalDsl.g:1416:4: (lv_length_5_0= ruleURDFAttrNumeric )
            // InternalDsl.g:1417:5: lv_length_5_0= ruleURDFAttrNumeric
            {

            					newCompositeNode(grammarAccess.getCylinderAccess().getLengthURDFAttrNumericParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_length_5_0=ruleURDFAttrNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCylinderRule());
            					}
            					set(
            						current,
            						"length",
            						lv_length_5_0,
            						"org.xtext.urdf.Dsl.URDFAttrNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCylinder"


    // $ANTLR start "entryRuleMesh"
    // InternalDsl.g:1438:1: entryRuleMesh returns [EObject current=null] : iv_ruleMesh= ruleMesh EOF ;
    public final EObject entryRuleMesh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMesh = null;


        try {
            // InternalDsl.g:1438:45: (iv_ruleMesh= ruleMesh EOF )
            // InternalDsl.g:1439:2: iv_ruleMesh= ruleMesh EOF
            {
             newCompositeNode(grammarAccess.getMeshRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMesh=ruleMesh();

            state._fsp--;

             current =iv_ruleMesh; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMesh"


    // $ANTLR start "ruleMesh"
    // InternalDsl.g:1445:1: ruleMesh returns [EObject current=null] : (otherlv_0= 'Mesh' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) ) (otherlv_4= 'scale' ( (lv_dimension_5_0= ruleBox ) ) )? ) ;
    public final EObject ruleMesh() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_pathToFile_3_0 = null;

        EObject lv_dimension_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1451:2: ( (otherlv_0= 'Mesh' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) ) (otherlv_4= 'scale' ( (lv_dimension_5_0= ruleBox ) ) )? ) )
            // InternalDsl.g:1452:2: (otherlv_0= 'Mesh' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) ) (otherlv_4= 'scale' ( (lv_dimension_5_0= ruleBox ) ) )? )
            {
            // InternalDsl.g:1452:2: (otherlv_0= 'Mesh' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) ) (otherlv_4= 'scale' ( (lv_dimension_5_0= ruleBox ) ) )? )
            // InternalDsl.g:1453:3: otherlv_0= 'Mesh' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) ) (otherlv_4= 'scale' ( (lv_dimension_5_0= ruleBox ) ) )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getMeshAccess().getMeshKeyword_0());
            		
            // InternalDsl.g:1457:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDsl.g:1458:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:1458:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:1459:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_41); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getMeshAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMeshRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,40,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getMeshAccess().getPathToFileKeyword_2());
            		
            // InternalDsl.g:1479:3: ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) )
            // InternalDsl.g:1480:4: (lv_pathToFile_3_0= ruleURDFAttrSTRING )
            {
            // InternalDsl.g:1480:4: (lv_pathToFile_3_0= ruleURDFAttrSTRING )
            // InternalDsl.g:1481:5: lv_pathToFile_3_0= ruleURDFAttrSTRING
            {

            					newCompositeNode(grammarAccess.getMeshAccess().getPathToFileURDFAttrSTRINGParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_43);
            lv_pathToFile_3_0=ruleURDFAttrSTRING();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeshRule());
            					}
            					set(
            						current,
            						"pathToFile",
            						lv_pathToFile_3_0,
            						"org.xtext.urdf.Dsl.URDFAttrSTRING");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:1498:3: (otherlv_4= 'scale' ( (lv_dimension_5_0= ruleBox ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:1499:4: otherlv_4= 'scale' ( (lv_dimension_5_0= ruleBox ) )
                    {
                    otherlv_4=(Token)match(input,41,FOLLOW_44); 

                    				newLeafNode(otherlv_4, grammarAccess.getMeshAccess().getScaleKeyword_4_0());
                    			
                    // InternalDsl.g:1503:4: ( (lv_dimension_5_0= ruleBox ) )
                    // InternalDsl.g:1504:5: (lv_dimension_5_0= ruleBox )
                    {
                    // InternalDsl.g:1504:5: (lv_dimension_5_0= ruleBox )
                    // InternalDsl.g:1505:6: lv_dimension_5_0= ruleBox
                    {

                    						newCompositeNode(grammarAccess.getMeshAccess().getDimensionBoxParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_dimension_5_0=ruleBox();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeshRule());
                    						}
                    						set(
                    							current,
                    							"dimension",
                    							lv_dimension_5_0,
                    							"org.xtext.urdf.Dsl.Box");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMesh"


    // $ANTLR start "entryRuleSphere"
    // InternalDsl.g:1527:1: entryRuleSphere returns [EObject current=null] : iv_ruleSphere= ruleSphere EOF ;
    public final EObject entryRuleSphere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSphere = null;


        try {
            // InternalDsl.g:1527:47: (iv_ruleSphere= ruleSphere EOF )
            // InternalDsl.g:1528:2: iv_ruleSphere= ruleSphere EOF
            {
             newCompositeNode(grammarAccess.getSphereRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSphere=ruleSphere();

            state._fsp--;

             current =iv_ruleSphere; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSphere"


    // $ANTLR start "ruleSphere"
    // InternalDsl.g:1534:1: ruleSphere returns [EObject current=null] : (otherlv_0= 'Sphere' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleURDFAttrNumeric ) ) ) ;
    public final EObject ruleSphere() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_radius_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1540:2: ( (otherlv_0= 'Sphere' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleURDFAttrNumeric ) ) ) )
            // InternalDsl.g:1541:2: (otherlv_0= 'Sphere' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleURDFAttrNumeric ) ) )
            {
            // InternalDsl.g:1541:2: (otherlv_0= 'Sphere' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleURDFAttrNumeric ) ) )
            // InternalDsl.g:1542:3: otherlv_0= 'Sphere' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleURDFAttrNumeric ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getSphereAccess().getSphereKeyword_0());
            		
            // InternalDsl.g:1546:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDsl.g:1547:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:1547:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:1548:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_39); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getSphereAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSphereRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,38,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getSphereAccess().getRadiusKeyword_2());
            		
            // InternalDsl.g:1568:3: ( (lv_radius_3_0= ruleURDFAttrNumeric ) )
            // InternalDsl.g:1569:4: (lv_radius_3_0= ruleURDFAttrNumeric )
            {
            // InternalDsl.g:1569:4: (lv_radius_3_0= ruleURDFAttrNumeric )
            // InternalDsl.g:1570:5: lv_radius_3_0= ruleURDFAttrNumeric
            {

            					newCompositeNode(grammarAccess.getSphereAccess().getRadiusURDFAttrNumericParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_radius_3_0=ruleURDFAttrNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSphereRule());
            					}
            					set(
            						current,
            						"radius",
            						lv_radius_3_0,
            						"org.xtext.urdf.Dsl.URDFAttrNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSphere"


    // $ANTLR start "entryRuleCollision"
    // InternalDsl.g:1591:1: entryRuleCollision returns [EObject current=null] : iv_ruleCollision= ruleCollision EOF ;
    public final EObject entryRuleCollision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollision = null;


        try {
            // InternalDsl.g:1591:50: (iv_ruleCollision= ruleCollision EOF )
            // InternalDsl.g:1592:2: iv_ruleCollision= ruleCollision EOF
            {
             newCompositeNode(grammarAccess.getCollisionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollision=ruleCollision();

            state._fsp--;

             current =iv_ruleCollision; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollision"


    // $ANTLR start "ruleCollision"
    // InternalDsl.g:1598:1: ruleCollision returns [EObject current=null] : ( () otherlv_1= 'Collision' ( (lv_name_2_0= RULE_ID ) )? ( (lv_geometry_3_0= ruleGeometry ) )* ( (lv_origin_4_0= ruleOrigin ) )? ) ;
    public final EObject ruleCollision() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_geometry_3_0 = null;

        EObject lv_origin_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1604:2: ( ( () otherlv_1= 'Collision' ( (lv_name_2_0= RULE_ID ) )? ( (lv_geometry_3_0= ruleGeometry ) )* ( (lv_origin_4_0= ruleOrigin ) )? ) )
            // InternalDsl.g:1605:2: ( () otherlv_1= 'Collision' ( (lv_name_2_0= RULE_ID ) )? ( (lv_geometry_3_0= ruleGeometry ) )* ( (lv_origin_4_0= ruleOrigin ) )? )
            {
            // InternalDsl.g:1605:2: ( () otherlv_1= 'Collision' ( (lv_name_2_0= RULE_ID ) )? ( (lv_geometry_3_0= ruleGeometry ) )* ( (lv_origin_4_0= ruleOrigin ) )? )
            // InternalDsl.g:1606:3: () otherlv_1= 'Collision' ( (lv_name_2_0= RULE_ID ) )? ( (lv_geometry_3_0= ruleGeometry ) )* ( (lv_origin_4_0= ruleOrigin ) )?
            {
            // InternalDsl.g:1606:3: ()
            // InternalDsl.g:1607:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCollisionAccess().getCollisionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getCollisionAccess().getCollisionKeyword_1());
            		
            // InternalDsl.g:1617:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDsl.g:1618:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalDsl.g:1618:4: (lv_name_2_0= RULE_ID )
                    // InternalDsl.g:1619:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_33); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getCollisionAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCollisionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:1635:3: ( (lv_geometry_3_0= ruleGeometry ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==33||LA27_0==37||LA27_0==39||LA27_0==42) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalDsl.g:1636:4: (lv_geometry_3_0= ruleGeometry )
            	    {
            	    // InternalDsl.g:1636:4: (lv_geometry_3_0= ruleGeometry )
            	    // InternalDsl.g:1637:5: lv_geometry_3_0= ruleGeometry
            	    {

            	    					newCompositeNode(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_geometry_3_0=ruleGeometry();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCollisionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"geometry",
            	    						lv_geometry_3_0,
            	    						"org.xtext.urdf.Dsl.Geometry");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // InternalDsl.g:1654:3: ( (lv_origin_4_0= ruleOrigin ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==44) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDsl.g:1655:4: (lv_origin_4_0= ruleOrigin )
                    {
                    // InternalDsl.g:1655:4: (lv_origin_4_0= ruleOrigin )
                    // InternalDsl.g:1656:5: lv_origin_4_0= ruleOrigin
                    {

                    					newCompositeNode(grammarAccess.getCollisionAccess().getOriginOriginParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_origin_4_0=ruleOrigin();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCollisionRule());
                    					}
                    					set(
                    						current,
                    						"origin",
                    						lv_origin_4_0,
                    						"org.xtext.urdf.Dsl.Origin");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollision"


    // $ANTLR start "entryRuleOrigin"
    // InternalDsl.g:1677:1: entryRuleOrigin returns [EObject current=null] : iv_ruleOrigin= ruleOrigin EOF ;
    public final EObject entryRuleOrigin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrigin = null;


        try {
            // InternalDsl.g:1677:47: (iv_ruleOrigin= ruleOrigin EOF )
            // InternalDsl.g:1678:2: iv_ruleOrigin= ruleOrigin EOF
            {
             newCompositeNode(grammarAccess.getOriginRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrigin=ruleOrigin();

            state._fsp--;

             current =iv_ruleOrigin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrigin"


    // $ANTLR start "ruleOrigin"
    // InternalDsl.g:1684:1: ruleOrigin returns [EObject current=null] : (otherlv_0= 'Origin' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'x' ( (lv_x_3_0= ruleURDFAttrSignedNumeric ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleURDFAttrSignedNumeric ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleURDFAttrSignedNumeric ) ) (otherlv_8= 'roll' ( (lv_roll_9_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_10= 'pitch' ( (lv_pitch_11_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_12= 'yaw' ( (lv_yaw_13_0= ruleURDFAttrSignedNumeric ) ) )? ) ;
    public final EObject ruleOrigin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_x_3_0 = null;

        EObject lv_y_5_0 = null;

        EObject lv_z_7_0 = null;

        EObject lv_roll_9_0 = null;

        EObject lv_pitch_11_0 = null;

        EObject lv_yaw_13_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1690:2: ( (otherlv_0= 'Origin' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'x' ( (lv_x_3_0= ruleURDFAttrSignedNumeric ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleURDFAttrSignedNumeric ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleURDFAttrSignedNumeric ) ) (otherlv_8= 'roll' ( (lv_roll_9_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_10= 'pitch' ( (lv_pitch_11_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_12= 'yaw' ( (lv_yaw_13_0= ruleURDFAttrSignedNumeric ) ) )? ) )
            // InternalDsl.g:1691:2: (otherlv_0= 'Origin' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'x' ( (lv_x_3_0= ruleURDFAttrSignedNumeric ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleURDFAttrSignedNumeric ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleURDFAttrSignedNumeric ) ) (otherlv_8= 'roll' ( (lv_roll_9_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_10= 'pitch' ( (lv_pitch_11_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_12= 'yaw' ( (lv_yaw_13_0= ruleURDFAttrSignedNumeric ) ) )? )
            {
            // InternalDsl.g:1691:2: (otherlv_0= 'Origin' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'x' ( (lv_x_3_0= ruleURDFAttrSignedNumeric ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleURDFAttrSignedNumeric ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleURDFAttrSignedNumeric ) ) (otherlv_8= 'roll' ( (lv_roll_9_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_10= 'pitch' ( (lv_pitch_11_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_12= 'yaw' ( (lv_yaw_13_0= ruleURDFAttrSignedNumeric ) ) )? )
            // InternalDsl.g:1692:3: otherlv_0= 'Origin' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'x' ( (lv_x_3_0= ruleURDFAttrSignedNumeric ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleURDFAttrSignedNumeric ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleURDFAttrSignedNumeric ) ) (otherlv_8= 'roll' ( (lv_roll_9_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_10= 'pitch' ( (lv_pitch_11_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_12= 'yaw' ( (lv_yaw_13_0= ruleURDFAttrSignedNumeric ) ) )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_45); 

            			newLeafNode(otherlv_0, grammarAccess.getOriginAccess().getOriginKeyword_0());
            		
            // InternalDsl.g:1696:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDsl.g:1697:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:1697:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:1698:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_46); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getOriginAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOriginRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,45,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getOriginAccess().getXKeyword_2());
            		
            // InternalDsl.g:1718:3: ( (lv_x_3_0= ruleURDFAttrSignedNumeric ) )
            // InternalDsl.g:1719:4: (lv_x_3_0= ruleURDFAttrSignedNumeric )
            {
            // InternalDsl.g:1719:4: (lv_x_3_0= ruleURDFAttrSignedNumeric )
            // InternalDsl.g:1720:5: lv_x_3_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getOriginAccess().getXURDFAttrSignedNumericParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_47);
            lv_x_3_0=ruleURDFAttrSignedNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOriginRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_3_0,
            						"org.xtext.urdf.Dsl.URDFAttrSignedNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,46,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getOriginAccess().getYKeyword_4());
            		
            // InternalDsl.g:1741:3: ( (lv_y_5_0= ruleURDFAttrSignedNumeric ) )
            // InternalDsl.g:1742:4: (lv_y_5_0= ruleURDFAttrSignedNumeric )
            {
            // InternalDsl.g:1742:4: (lv_y_5_0= ruleURDFAttrSignedNumeric )
            // InternalDsl.g:1743:5: lv_y_5_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getOriginAccess().getYURDFAttrSignedNumericParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_48);
            lv_y_5_0=ruleURDFAttrSignedNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOriginRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_5_0,
            						"org.xtext.urdf.Dsl.URDFAttrSignedNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,47,FOLLOW_26); 

            			newLeafNode(otherlv_6, grammarAccess.getOriginAccess().getZKeyword_6());
            		
            // InternalDsl.g:1764:3: ( (lv_z_7_0= ruleURDFAttrSignedNumeric ) )
            // InternalDsl.g:1765:4: (lv_z_7_0= ruleURDFAttrSignedNumeric )
            {
            // InternalDsl.g:1765:4: (lv_z_7_0= ruleURDFAttrSignedNumeric )
            // InternalDsl.g:1766:5: lv_z_7_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getOriginAccess().getZURDFAttrSignedNumericParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_49);
            lv_z_7_0=ruleURDFAttrSignedNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOriginRule());
            					}
            					set(
            						current,
            						"z",
            						lv_z_7_0,
            						"org.xtext.urdf.Dsl.URDFAttrSignedNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:1783:3: (otherlv_8= 'roll' ( (lv_roll_9_0= ruleURDFAttrSignedNumeric ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==48) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDsl.g:1784:4: otherlv_8= 'roll' ( (lv_roll_9_0= ruleURDFAttrSignedNumeric ) )
                    {
                    otherlv_8=(Token)match(input,48,FOLLOW_26); 

                    				newLeafNode(otherlv_8, grammarAccess.getOriginAccess().getRollKeyword_8_0());
                    			
                    // InternalDsl.g:1788:4: ( (lv_roll_9_0= ruleURDFAttrSignedNumeric ) )
                    // InternalDsl.g:1789:5: (lv_roll_9_0= ruleURDFAttrSignedNumeric )
                    {
                    // InternalDsl.g:1789:5: (lv_roll_9_0= ruleURDFAttrSignedNumeric )
                    // InternalDsl.g:1790:6: lv_roll_9_0= ruleURDFAttrSignedNumeric
                    {

                    						newCompositeNode(grammarAccess.getOriginAccess().getRollURDFAttrSignedNumericParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    lv_roll_9_0=ruleURDFAttrSignedNumeric();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOriginRule());
                    						}
                    						set(
                    							current,
                    							"roll",
                    							lv_roll_9_0,
                    							"org.xtext.urdf.Dsl.URDFAttrSignedNumeric");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1808:3: (otherlv_10= 'pitch' ( (lv_pitch_11_0= ruleURDFAttrSignedNumeric ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==49) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDsl.g:1809:4: otherlv_10= 'pitch' ( (lv_pitch_11_0= ruleURDFAttrSignedNumeric ) )
                    {
                    otherlv_10=(Token)match(input,49,FOLLOW_26); 

                    				newLeafNode(otherlv_10, grammarAccess.getOriginAccess().getPitchKeyword_9_0());
                    			
                    // InternalDsl.g:1813:4: ( (lv_pitch_11_0= ruleURDFAttrSignedNumeric ) )
                    // InternalDsl.g:1814:5: (lv_pitch_11_0= ruleURDFAttrSignedNumeric )
                    {
                    // InternalDsl.g:1814:5: (lv_pitch_11_0= ruleURDFAttrSignedNumeric )
                    // InternalDsl.g:1815:6: lv_pitch_11_0= ruleURDFAttrSignedNumeric
                    {

                    						newCompositeNode(grammarAccess.getOriginAccess().getPitchURDFAttrSignedNumericParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_pitch_11_0=ruleURDFAttrSignedNumeric();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOriginRule());
                    						}
                    						set(
                    							current,
                    							"pitch",
                    							lv_pitch_11_0,
                    							"org.xtext.urdf.Dsl.URDFAttrSignedNumeric");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1833:3: (otherlv_12= 'yaw' ( (lv_yaw_13_0= ruleURDFAttrSignedNumeric ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==50) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDsl.g:1834:4: otherlv_12= 'yaw' ( (lv_yaw_13_0= ruleURDFAttrSignedNumeric ) )
                    {
                    otherlv_12=(Token)match(input,50,FOLLOW_26); 

                    				newLeafNode(otherlv_12, grammarAccess.getOriginAccess().getYawKeyword_10_0());
                    			
                    // InternalDsl.g:1838:4: ( (lv_yaw_13_0= ruleURDFAttrSignedNumeric ) )
                    // InternalDsl.g:1839:5: (lv_yaw_13_0= ruleURDFAttrSignedNumeric )
                    {
                    // InternalDsl.g:1839:5: (lv_yaw_13_0= ruleURDFAttrSignedNumeric )
                    // InternalDsl.g:1840:6: lv_yaw_13_0= ruleURDFAttrSignedNumeric
                    {

                    						newCompositeNode(grammarAccess.getOriginAccess().getYawURDFAttrSignedNumericParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_yaw_13_0=ruleURDFAttrSignedNumeric();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOriginRule());
                    						}
                    						set(
                    							current,
                    							"yaw",
                    							lv_yaw_13_0,
                    							"org.xtext.urdf.Dsl.URDFAttrSignedNumeric");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrigin"


    // $ANTLR start "entryRuleMass"
    // InternalDsl.g:1862:1: entryRuleMass returns [EObject current=null] : iv_ruleMass= ruleMass EOF ;
    public final EObject entryRuleMass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMass = null;


        try {
            // InternalDsl.g:1862:45: (iv_ruleMass= ruleMass EOF )
            // InternalDsl.g:1863:2: iv_ruleMass= ruleMass EOF
            {
             newCompositeNode(grammarAccess.getMassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMass=ruleMass();

            state._fsp--;

             current =iv_ruleMass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMass"


    // $ANTLR start "ruleMass"
    // InternalDsl.g:1869:1: ruleMass returns [EObject current=null] : (otherlv_0= 'Mass' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'mass_(ValueInKilograms)' ( (lv_massValueInKilograms_3_0= ruleURDFAttrNumeric ) ) ) ;
    public final EObject ruleMass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_massValueInKilograms_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1875:2: ( (otherlv_0= 'Mass' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'mass_(ValueInKilograms)' ( (lv_massValueInKilograms_3_0= ruleURDFAttrNumeric ) ) ) )
            // InternalDsl.g:1876:2: (otherlv_0= 'Mass' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'mass_(ValueInKilograms)' ( (lv_massValueInKilograms_3_0= ruleURDFAttrNumeric ) ) )
            {
            // InternalDsl.g:1876:2: (otherlv_0= 'Mass' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'mass_(ValueInKilograms)' ( (lv_massValueInKilograms_3_0= ruleURDFAttrNumeric ) ) )
            // InternalDsl.g:1877:3: otherlv_0= 'Mass' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'mass_(ValueInKilograms)' ( (lv_massValueInKilograms_3_0= ruleURDFAttrNumeric ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_52); 

            			newLeafNode(otherlv_0, grammarAccess.getMassAccess().getMassKeyword_0());
            		
            // InternalDsl.g:1881:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDsl.g:1882:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:1882:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:1883:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_53); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getMassAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMassRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,52,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getMassAccess().getMass_ValueInKilogramsKeyword_2());
            		
            // InternalDsl.g:1903:3: ( (lv_massValueInKilograms_3_0= ruleURDFAttrNumeric ) )
            // InternalDsl.g:1904:4: (lv_massValueInKilograms_3_0= ruleURDFAttrNumeric )
            {
            // InternalDsl.g:1904:4: (lv_massValueInKilograms_3_0= ruleURDFAttrNumeric )
            // InternalDsl.g:1905:5: lv_massValueInKilograms_3_0= ruleURDFAttrNumeric
            {

            					newCompositeNode(grammarAccess.getMassAccess().getMassValueInKilogramsURDFAttrNumericParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_massValueInKilograms_3_0=ruleURDFAttrNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMassRule());
            					}
            					set(
            						current,
            						"massValueInKilograms",
            						lv_massValueInKilograms_3_0,
            						"org.xtext.urdf.Dsl.URDFAttrNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMass"


    // $ANTLR start "entryRuleColor"
    // InternalDsl.g:1926:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalDsl.g:1926:46: (iv_ruleColor= ruleColor EOF )
            // InternalDsl.g:1927:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalDsl.g:1933:1: ruleColor returns [EObject current=null] : (otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'red' ( (lv_red_3_0= ruleURDFAttrFloat ) ) otherlv_4= 'green' ( (lv_green_5_0= ruleURDFAttrFloat ) ) otherlv_6= 'blue' ( (lv_blue_7_0= ruleURDFAttrFloat ) ) otherlv_8= 'alpha' ( (lv_alpha_9_0= ruleURDFAttrFloat ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_red_3_0 = null;

        EObject lv_green_5_0 = null;

        EObject lv_blue_7_0 = null;

        EObject lv_alpha_9_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1939:2: ( (otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'red' ( (lv_red_3_0= ruleURDFAttrFloat ) ) otherlv_4= 'green' ( (lv_green_5_0= ruleURDFAttrFloat ) ) otherlv_6= 'blue' ( (lv_blue_7_0= ruleURDFAttrFloat ) ) otherlv_8= 'alpha' ( (lv_alpha_9_0= ruleURDFAttrFloat ) ) ) )
            // InternalDsl.g:1940:2: (otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'red' ( (lv_red_3_0= ruleURDFAttrFloat ) ) otherlv_4= 'green' ( (lv_green_5_0= ruleURDFAttrFloat ) ) otherlv_6= 'blue' ( (lv_blue_7_0= ruleURDFAttrFloat ) ) otherlv_8= 'alpha' ( (lv_alpha_9_0= ruleURDFAttrFloat ) ) )
            {
            // InternalDsl.g:1940:2: (otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'red' ( (lv_red_3_0= ruleURDFAttrFloat ) ) otherlv_4= 'green' ( (lv_green_5_0= ruleURDFAttrFloat ) ) otherlv_6= 'blue' ( (lv_blue_7_0= ruleURDFAttrFloat ) ) otherlv_8= 'alpha' ( (lv_alpha_9_0= ruleURDFAttrFloat ) ) )
            // InternalDsl.g:1941:3: otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'red' ( (lv_red_3_0= ruleURDFAttrFloat ) ) otherlv_4= 'green' ( (lv_green_5_0= ruleURDFAttrFloat ) ) otherlv_6= 'blue' ( (lv_blue_7_0= ruleURDFAttrFloat ) ) otherlv_8= 'alpha' ( (lv_alpha_9_0= ruleURDFAttrFloat ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_54); 

            			newLeafNode(otherlv_0, grammarAccess.getColorAccess().getColorKeyword_0());
            		
            // InternalDsl.g:1945:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDsl.g:1946:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:1946:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:1947:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_55); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getColorAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getColorRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,54,FOLLOW_56); 

            			newLeafNode(otherlv_2, grammarAccess.getColorAccess().getRedKeyword_2());
            		
            // InternalDsl.g:1967:3: ( (lv_red_3_0= ruleURDFAttrFloat ) )
            // InternalDsl.g:1968:4: (lv_red_3_0= ruleURDFAttrFloat )
            {
            // InternalDsl.g:1968:4: (lv_red_3_0= ruleURDFAttrFloat )
            // InternalDsl.g:1969:5: lv_red_3_0= ruleURDFAttrFloat
            {

            					newCompositeNode(grammarAccess.getColorAccess().getRedURDFAttrFloatParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_57);
            lv_red_3_0=ruleURDFAttrFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorRule());
            					}
            					set(
            						current,
            						"red",
            						lv_red_3_0,
            						"org.xtext.urdf.Dsl.URDFAttrFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,55,FOLLOW_56); 

            			newLeafNode(otherlv_4, grammarAccess.getColorAccess().getGreenKeyword_4());
            		
            // InternalDsl.g:1990:3: ( (lv_green_5_0= ruleURDFAttrFloat ) )
            // InternalDsl.g:1991:4: (lv_green_5_0= ruleURDFAttrFloat )
            {
            // InternalDsl.g:1991:4: (lv_green_5_0= ruleURDFAttrFloat )
            // InternalDsl.g:1992:5: lv_green_5_0= ruleURDFAttrFloat
            {

            					newCompositeNode(grammarAccess.getColorAccess().getGreenURDFAttrFloatParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_58);
            lv_green_5_0=ruleURDFAttrFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorRule());
            					}
            					set(
            						current,
            						"green",
            						lv_green_5_0,
            						"org.xtext.urdf.Dsl.URDFAttrFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,56,FOLLOW_56); 

            			newLeafNode(otherlv_6, grammarAccess.getColorAccess().getBlueKeyword_6());
            		
            // InternalDsl.g:2013:3: ( (lv_blue_7_0= ruleURDFAttrFloat ) )
            // InternalDsl.g:2014:4: (lv_blue_7_0= ruleURDFAttrFloat )
            {
            // InternalDsl.g:2014:4: (lv_blue_7_0= ruleURDFAttrFloat )
            // InternalDsl.g:2015:5: lv_blue_7_0= ruleURDFAttrFloat
            {

            					newCompositeNode(grammarAccess.getColorAccess().getBlueURDFAttrFloatParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_59);
            lv_blue_7_0=ruleURDFAttrFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorRule());
            					}
            					set(
            						current,
            						"blue",
            						lv_blue_7_0,
            						"org.xtext.urdf.Dsl.URDFAttrFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,57,FOLLOW_56); 

            			newLeafNode(otherlv_8, grammarAccess.getColorAccess().getAlphaKeyword_8());
            		
            // InternalDsl.g:2036:3: ( (lv_alpha_9_0= ruleURDFAttrFloat ) )
            // InternalDsl.g:2037:4: (lv_alpha_9_0= ruleURDFAttrFloat )
            {
            // InternalDsl.g:2037:4: (lv_alpha_9_0= ruleURDFAttrFloat )
            // InternalDsl.g:2038:5: lv_alpha_9_0= ruleURDFAttrFloat
            {

            					newCompositeNode(grammarAccess.getColorAccess().getAlphaURDFAttrFloatParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_alpha_9_0=ruleURDFAttrFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorRule());
            					}
            					set(
            						current,
            						"alpha",
            						lv_alpha_9_0,
            						"org.xtext.urdf.Dsl.URDFAttrFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleTexture"
    // InternalDsl.g:2059:1: entryRuleTexture returns [EObject current=null] : iv_ruleTexture= ruleTexture EOF ;
    public final EObject entryRuleTexture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTexture = null;


        try {
            // InternalDsl.g:2059:48: (iv_ruleTexture= ruleTexture EOF )
            // InternalDsl.g:2060:2: iv_ruleTexture= ruleTexture EOF
            {
             newCompositeNode(grammarAccess.getTextureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTexture=ruleTexture();

            state._fsp--;

             current =iv_ruleTexture; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTexture"


    // $ANTLR start "ruleTexture"
    // InternalDsl.g:2066:1: ruleTexture returns [EObject current=null] : (otherlv_0= 'Texture' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) ) ) ;
    public final EObject ruleTexture() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_pathToFile_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2072:2: ( (otherlv_0= 'Texture' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) ) ) )
            // InternalDsl.g:2073:2: (otherlv_0= 'Texture' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) ) )
            {
            // InternalDsl.g:2073:2: (otherlv_0= 'Texture' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) ) )
            // InternalDsl.g:2074:3: otherlv_0= 'Texture' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getTextureAccess().getTextureKeyword_0());
            		
            // InternalDsl.g:2078:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDsl.g:2079:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:2079:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:2080:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_41); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getTextureAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTextureRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,40,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getTextureAccess().getPathToFileKeyword_2());
            		
            // InternalDsl.g:2100:3: ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) )
            // InternalDsl.g:2101:4: (lv_pathToFile_3_0= ruleURDFAttrSTRING )
            {
            // InternalDsl.g:2101:4: (lv_pathToFile_3_0= ruleURDFAttrSTRING )
            // InternalDsl.g:2102:5: lv_pathToFile_3_0= ruleURDFAttrSTRING
            {

            					newCompositeNode(grammarAccess.getTextureAccess().getPathToFileURDFAttrSTRINGParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_pathToFile_3_0=ruleURDFAttrSTRING();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextureRule());
            					}
            					set(
            						current,
            						"pathToFile",
            						lv_pathToFile_3_0,
            						"org.xtext.urdf.Dsl.URDFAttrSTRING");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTexture"


    // $ANTLR start "entryRuleLimit"
    // InternalDsl.g:2123:1: entryRuleLimit returns [EObject current=null] : iv_ruleLimit= ruleLimit EOF ;
    public final EObject entryRuleLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimit = null;


        try {
            // InternalDsl.g:2123:46: (iv_ruleLimit= ruleLimit EOF )
            // InternalDsl.g:2124:2: iv_ruleLimit= ruleLimit EOF
            {
             newCompositeNode(grammarAccess.getLimitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLimit=ruleLimit();

            state._fsp--;

             current =iv_ruleLimit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLimit"


    // $ANTLR start "ruleLimit"
    // InternalDsl.g:2130:1: ruleLimit returns [EObject current=null] : (otherlv_0= 'Limit' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'effort' ( (lv_effort_3_0= ruleURDFAttrSignedNumeric ) ) otherlv_4= 'velocity' ( (lv_velocity_5_0= ruleURDFAttrSignedNumeric ) ) otherlv_6= 'lower' ( (lv_lower_7_0= ruleURDFAttrSignedNumeric ) )? otherlv_8= 'upper' ( (lv_upper_9_0= ruleURDFAttrSignedNumeric ) )? ) ;
    public final EObject ruleLimit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_effort_3_0 = null;

        EObject lv_velocity_5_0 = null;

        EObject lv_lower_7_0 = null;

        EObject lv_upper_9_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2136:2: ( (otherlv_0= 'Limit' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'effort' ( (lv_effort_3_0= ruleURDFAttrSignedNumeric ) ) otherlv_4= 'velocity' ( (lv_velocity_5_0= ruleURDFAttrSignedNumeric ) ) otherlv_6= 'lower' ( (lv_lower_7_0= ruleURDFAttrSignedNumeric ) )? otherlv_8= 'upper' ( (lv_upper_9_0= ruleURDFAttrSignedNumeric ) )? ) )
            // InternalDsl.g:2137:2: (otherlv_0= 'Limit' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'effort' ( (lv_effort_3_0= ruleURDFAttrSignedNumeric ) ) otherlv_4= 'velocity' ( (lv_velocity_5_0= ruleURDFAttrSignedNumeric ) ) otherlv_6= 'lower' ( (lv_lower_7_0= ruleURDFAttrSignedNumeric ) )? otherlv_8= 'upper' ( (lv_upper_9_0= ruleURDFAttrSignedNumeric ) )? )
            {
            // InternalDsl.g:2137:2: (otherlv_0= 'Limit' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'effort' ( (lv_effort_3_0= ruleURDFAttrSignedNumeric ) ) otherlv_4= 'velocity' ( (lv_velocity_5_0= ruleURDFAttrSignedNumeric ) ) otherlv_6= 'lower' ( (lv_lower_7_0= ruleURDFAttrSignedNumeric ) )? otherlv_8= 'upper' ( (lv_upper_9_0= ruleURDFAttrSignedNumeric ) )? )
            // InternalDsl.g:2138:3: otherlv_0= 'Limit' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'effort' ( (lv_effort_3_0= ruleURDFAttrSignedNumeric ) ) otherlv_4= 'velocity' ( (lv_velocity_5_0= ruleURDFAttrSignedNumeric ) ) otherlv_6= 'lower' ( (lv_lower_7_0= ruleURDFAttrSignedNumeric ) )? otherlv_8= 'upper' ( (lv_upper_9_0= ruleURDFAttrSignedNumeric ) )?
            {
            otherlv_0=(Token)match(input,59,FOLLOW_60); 

            			newLeafNode(otherlv_0, grammarAccess.getLimitAccess().getLimitKeyword_0());
            		
            // InternalDsl.g:2142:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDsl.g:2143:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:2143:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:2144:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_61); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getLimitAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLimitRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,60,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getLimitAccess().getEffortKeyword_2());
            		
            // InternalDsl.g:2164:3: ( (lv_effort_3_0= ruleURDFAttrSignedNumeric ) )
            // InternalDsl.g:2165:4: (lv_effort_3_0= ruleURDFAttrSignedNumeric )
            {
            // InternalDsl.g:2165:4: (lv_effort_3_0= ruleURDFAttrSignedNumeric )
            // InternalDsl.g:2166:5: lv_effort_3_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getLimitAccess().getEffortURDFAttrSignedNumericParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_62);
            lv_effort_3_0=ruleURDFAttrSignedNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLimitRule());
            					}
            					set(
            						current,
            						"effort",
            						lv_effort_3_0,
            						"org.xtext.urdf.Dsl.URDFAttrSignedNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,61,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getLimitAccess().getVelocityKeyword_4());
            		
            // InternalDsl.g:2187:3: ( (lv_velocity_5_0= ruleURDFAttrSignedNumeric ) )
            // InternalDsl.g:2188:4: (lv_velocity_5_0= ruleURDFAttrSignedNumeric )
            {
            // InternalDsl.g:2188:4: (lv_velocity_5_0= ruleURDFAttrSignedNumeric )
            // InternalDsl.g:2189:5: lv_velocity_5_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getLimitAccess().getVelocityURDFAttrSignedNumericParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_63);
            lv_velocity_5_0=ruleURDFAttrSignedNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLimitRule());
            					}
            					set(
            						current,
            						"velocity",
            						lv_velocity_5_0,
            						"org.xtext.urdf.Dsl.URDFAttrSignedNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,62,FOLLOW_64); 

            			newLeafNode(otherlv_6, grammarAccess.getLimitAccess().getLowerKeyword_6());
            		
            // InternalDsl.g:2210:3: ( (lv_lower_7_0= ruleURDFAttrSignedNumeric ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_INT||LA37_0==79) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDsl.g:2211:4: (lv_lower_7_0= ruleURDFAttrSignedNumeric )
                    {
                    // InternalDsl.g:2211:4: (lv_lower_7_0= ruleURDFAttrSignedNumeric )
                    // InternalDsl.g:2212:5: lv_lower_7_0= ruleURDFAttrSignedNumeric
                    {

                    					newCompositeNode(grammarAccess.getLimitAccess().getLowerURDFAttrSignedNumericParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_65);
                    lv_lower_7_0=ruleURDFAttrSignedNumeric();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLimitRule());
                    					}
                    					set(
                    						current,
                    						"lower",
                    						lv_lower_7_0,
                    						"org.xtext.urdf.Dsl.URDFAttrSignedNumeric");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,63,FOLLOW_66); 

            			newLeafNode(otherlv_8, grammarAccess.getLimitAccess().getUpperKeyword_8());
            		
            // InternalDsl.g:2233:3: ( (lv_upper_9_0= ruleURDFAttrSignedNumeric ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_INT||LA38_0==79) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDsl.g:2234:4: (lv_upper_9_0= ruleURDFAttrSignedNumeric )
                    {
                    // InternalDsl.g:2234:4: (lv_upper_9_0= ruleURDFAttrSignedNumeric )
                    // InternalDsl.g:2235:5: lv_upper_9_0= ruleURDFAttrSignedNumeric
                    {

                    					newCompositeNode(grammarAccess.getLimitAccess().getUpperURDFAttrSignedNumericParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_upper_9_0=ruleURDFAttrSignedNumeric();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLimitRule());
                    					}
                    					set(
                    						current,
                    						"upper",
                    						lv_upper_9_0,
                    						"org.xtext.urdf.Dsl.URDFAttrSignedNumeric");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLimit"


    // $ANTLR start "entryRuleAxis"
    // InternalDsl.g:2256:1: entryRuleAxis returns [EObject current=null] : iv_ruleAxis= ruleAxis EOF ;
    public final EObject entryRuleAxis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxis = null;


        try {
            // InternalDsl.g:2256:45: (iv_ruleAxis= ruleAxis EOF )
            // InternalDsl.g:2257:2: iv_ruleAxis= ruleAxis EOF
            {
             newCompositeNode(grammarAccess.getAxisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAxis=ruleAxis();

            state._fsp--;

             current =iv_ruleAxis; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAxis"


    // $ANTLR start "ruleAxis"
    // InternalDsl.g:2263:1: ruleAxis returns [EObject current=null] : (otherlv_0= 'Axis' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'x' ( (lv_x_3_0= ruleURDFAttrINT ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleURDFAttrINT ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleURDFAttrINT ) ) ) ;
    public final EObject ruleAxis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_x_3_0 = null;

        EObject lv_y_5_0 = null;

        EObject lv_z_7_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2269:2: ( (otherlv_0= 'Axis' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'x' ( (lv_x_3_0= ruleURDFAttrINT ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleURDFAttrINT ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleURDFAttrINT ) ) ) )
            // InternalDsl.g:2270:2: (otherlv_0= 'Axis' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'x' ( (lv_x_3_0= ruleURDFAttrINT ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleURDFAttrINT ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleURDFAttrINT ) ) )
            {
            // InternalDsl.g:2270:2: (otherlv_0= 'Axis' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'x' ( (lv_x_3_0= ruleURDFAttrINT ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleURDFAttrINT ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleURDFAttrINT ) ) )
            // InternalDsl.g:2271:3: otherlv_0= 'Axis' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'x' ( (lv_x_3_0= ruleURDFAttrINT ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleURDFAttrINT ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleURDFAttrINT ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_45); 

            			newLeafNode(otherlv_0, grammarAccess.getAxisAccess().getAxisKeyword_0());
            		
            // InternalDsl.g:2275:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDsl.g:2276:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:2276:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:2277:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_46); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getAxisAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAxisRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,45,FOLLOW_56); 

            			newLeafNode(otherlv_2, grammarAccess.getAxisAccess().getXKeyword_2());
            		
            // InternalDsl.g:2297:3: ( (lv_x_3_0= ruleURDFAttrINT ) )
            // InternalDsl.g:2298:4: (lv_x_3_0= ruleURDFAttrINT )
            {
            // InternalDsl.g:2298:4: (lv_x_3_0= ruleURDFAttrINT )
            // InternalDsl.g:2299:5: lv_x_3_0= ruleURDFAttrINT
            {

            					newCompositeNode(grammarAccess.getAxisAccess().getXURDFAttrINTParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_47);
            lv_x_3_0=ruleURDFAttrINT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAxisRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_3_0,
            						"org.xtext.urdf.Dsl.URDFAttrINT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,46,FOLLOW_56); 

            			newLeafNode(otherlv_4, grammarAccess.getAxisAccess().getYKeyword_4());
            		
            // InternalDsl.g:2320:3: ( (lv_y_5_0= ruleURDFAttrINT ) )
            // InternalDsl.g:2321:4: (lv_y_5_0= ruleURDFAttrINT )
            {
            // InternalDsl.g:2321:4: (lv_y_5_0= ruleURDFAttrINT )
            // InternalDsl.g:2322:5: lv_y_5_0= ruleURDFAttrINT
            {

            					newCompositeNode(grammarAccess.getAxisAccess().getYURDFAttrINTParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_48);
            lv_y_5_0=ruleURDFAttrINT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAxisRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_5_0,
            						"org.xtext.urdf.Dsl.URDFAttrINT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,47,FOLLOW_56); 

            			newLeafNode(otherlv_6, grammarAccess.getAxisAccess().getZKeyword_6());
            		
            // InternalDsl.g:2343:3: ( (lv_z_7_0= ruleURDFAttrINT ) )
            // InternalDsl.g:2344:4: (lv_z_7_0= ruleURDFAttrINT )
            {
            // InternalDsl.g:2344:4: (lv_z_7_0= ruleURDFAttrINT )
            // InternalDsl.g:2345:5: lv_z_7_0= ruleURDFAttrINT
            {

            					newCompositeNode(grammarAccess.getAxisAccess().getZURDFAttrINTParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_z_7_0=ruleURDFAttrINT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAxisRule());
            					}
            					set(
            						current,
            						"z",
            						lv_z_7_0,
            						"org.xtext.urdf.Dsl.URDFAttrINT");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAxis"


    // $ANTLR start "entryRuleCalibration"
    // InternalDsl.g:2366:1: entryRuleCalibration returns [EObject current=null] : iv_ruleCalibration= ruleCalibration EOF ;
    public final EObject entryRuleCalibration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalibration = null;


        try {
            // InternalDsl.g:2366:52: (iv_ruleCalibration= ruleCalibration EOF )
            // InternalDsl.g:2367:2: iv_ruleCalibration= ruleCalibration EOF
            {
             newCompositeNode(grammarAccess.getCalibrationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCalibration=ruleCalibration();

            state._fsp--;

             current =iv_ruleCalibration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCalibration"


    // $ANTLR start "ruleCalibration"
    // InternalDsl.g:2373:1: ruleCalibration returns [EObject current=null] : ( () otherlv_1= 'Calibration' ( (lv_name_2_0= RULE_ID ) )? (otherlv_3= 'rising' ( (lv_rising_4_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_5= 'falling' ( (lv_falling_6_0= ruleURDFAttrSignedNumeric ) ) )? ) ;
    public final EObject ruleCalibration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_rising_4_0 = null;

        EObject lv_falling_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2379:2: ( ( () otherlv_1= 'Calibration' ( (lv_name_2_0= RULE_ID ) )? (otherlv_3= 'rising' ( (lv_rising_4_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_5= 'falling' ( (lv_falling_6_0= ruleURDFAttrSignedNumeric ) ) )? ) )
            // InternalDsl.g:2380:2: ( () otherlv_1= 'Calibration' ( (lv_name_2_0= RULE_ID ) )? (otherlv_3= 'rising' ( (lv_rising_4_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_5= 'falling' ( (lv_falling_6_0= ruleURDFAttrSignedNumeric ) ) )? )
            {
            // InternalDsl.g:2380:2: ( () otherlv_1= 'Calibration' ( (lv_name_2_0= RULE_ID ) )? (otherlv_3= 'rising' ( (lv_rising_4_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_5= 'falling' ( (lv_falling_6_0= ruleURDFAttrSignedNumeric ) ) )? )
            // InternalDsl.g:2381:3: () otherlv_1= 'Calibration' ( (lv_name_2_0= RULE_ID ) )? (otherlv_3= 'rising' ( (lv_rising_4_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_5= 'falling' ( (lv_falling_6_0= ruleURDFAttrSignedNumeric ) ) )?
            {
            // InternalDsl.g:2381:3: ()
            // InternalDsl.g:2382:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCalibrationAccess().getCalibrationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_67); 

            			newLeafNode(otherlv_1, grammarAccess.getCalibrationAccess().getCalibrationKeyword_1());
            		
            // InternalDsl.g:2392:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDsl.g:2393:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalDsl.g:2393:4: (lv_name_2_0= RULE_ID )
                    // InternalDsl.g:2394:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_68); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getCalibrationAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCalibrationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:2410:3: (otherlv_3= 'rising' ( (lv_rising_4_0= ruleURDFAttrSignedNumeric ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==66) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDsl.g:2411:4: otherlv_3= 'rising' ( (lv_rising_4_0= ruleURDFAttrSignedNumeric ) )
                    {
                    otherlv_3=(Token)match(input,66,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getCalibrationAccess().getRisingKeyword_3_0());
                    			
                    // InternalDsl.g:2415:4: ( (lv_rising_4_0= ruleURDFAttrSignedNumeric ) )
                    // InternalDsl.g:2416:5: (lv_rising_4_0= ruleURDFAttrSignedNumeric )
                    {
                    // InternalDsl.g:2416:5: (lv_rising_4_0= ruleURDFAttrSignedNumeric )
                    // InternalDsl.g:2417:6: lv_rising_4_0= ruleURDFAttrSignedNumeric
                    {

                    						newCompositeNode(grammarAccess.getCalibrationAccess().getRisingURDFAttrSignedNumericParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_69);
                    lv_rising_4_0=ruleURDFAttrSignedNumeric();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCalibrationRule());
                    						}
                    						set(
                    							current,
                    							"rising",
                    							lv_rising_4_0,
                    							"org.xtext.urdf.Dsl.URDFAttrSignedNumeric");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2435:3: (otherlv_5= 'falling' ( (lv_falling_6_0= ruleURDFAttrSignedNumeric ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==67) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDsl.g:2436:4: otherlv_5= 'falling' ( (lv_falling_6_0= ruleURDFAttrSignedNumeric ) )
                    {
                    otherlv_5=(Token)match(input,67,FOLLOW_26); 

                    				newLeafNode(otherlv_5, grammarAccess.getCalibrationAccess().getFallingKeyword_4_0());
                    			
                    // InternalDsl.g:2440:4: ( (lv_falling_6_0= ruleURDFAttrSignedNumeric ) )
                    // InternalDsl.g:2441:5: (lv_falling_6_0= ruleURDFAttrSignedNumeric )
                    {
                    // InternalDsl.g:2441:5: (lv_falling_6_0= ruleURDFAttrSignedNumeric )
                    // InternalDsl.g:2442:6: lv_falling_6_0= ruleURDFAttrSignedNumeric
                    {

                    						newCompositeNode(grammarAccess.getCalibrationAccess().getFallingURDFAttrSignedNumericParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_falling_6_0=ruleURDFAttrSignedNumeric();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCalibrationRule());
                    						}
                    						set(
                    							current,
                    							"falling",
                    							lv_falling_6_0,
                    							"org.xtext.urdf.Dsl.URDFAttrSignedNumeric");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCalibration"


    // $ANTLR start "entryRuleDynamics"
    // InternalDsl.g:2464:1: entryRuleDynamics returns [EObject current=null] : iv_ruleDynamics= ruleDynamics EOF ;
    public final EObject entryRuleDynamics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamics = null;


        try {
            // InternalDsl.g:2464:49: (iv_ruleDynamics= ruleDynamics EOF )
            // InternalDsl.g:2465:2: iv_ruleDynamics= ruleDynamics EOF
            {
             newCompositeNode(grammarAccess.getDynamicsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDynamics=ruleDynamics();

            state._fsp--;

             current =iv_ruleDynamics; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDynamics"


    // $ANTLR start "ruleDynamics"
    // InternalDsl.g:2471:1: ruleDynamics returns [EObject current=null] : ( () otherlv_1= 'Dynamics' ( (lv_name_2_0= RULE_ID ) )? (otherlv_3= 'friction' ( (lv_friction_4_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_5= 'damping' ( (lv_damping_6_0= ruleURDFAttrSignedNumeric ) ) )? ) ;
    public final EObject ruleDynamics() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_friction_4_0 = null;

        EObject lv_damping_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2477:2: ( ( () otherlv_1= 'Dynamics' ( (lv_name_2_0= RULE_ID ) )? (otherlv_3= 'friction' ( (lv_friction_4_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_5= 'damping' ( (lv_damping_6_0= ruleURDFAttrSignedNumeric ) ) )? ) )
            // InternalDsl.g:2478:2: ( () otherlv_1= 'Dynamics' ( (lv_name_2_0= RULE_ID ) )? (otherlv_3= 'friction' ( (lv_friction_4_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_5= 'damping' ( (lv_damping_6_0= ruleURDFAttrSignedNumeric ) ) )? )
            {
            // InternalDsl.g:2478:2: ( () otherlv_1= 'Dynamics' ( (lv_name_2_0= RULE_ID ) )? (otherlv_3= 'friction' ( (lv_friction_4_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_5= 'damping' ( (lv_damping_6_0= ruleURDFAttrSignedNumeric ) ) )? )
            // InternalDsl.g:2479:3: () otherlv_1= 'Dynamics' ( (lv_name_2_0= RULE_ID ) )? (otherlv_3= 'friction' ( (lv_friction_4_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_5= 'damping' ( (lv_damping_6_0= ruleURDFAttrSignedNumeric ) ) )?
            {
            // InternalDsl.g:2479:3: ()
            // InternalDsl.g:2480:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDynamicsAccess().getDynamicsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,68,FOLLOW_70); 

            			newLeafNode(otherlv_1, grammarAccess.getDynamicsAccess().getDynamicsKeyword_1());
            		
            // InternalDsl.g:2490:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDsl.g:2491:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalDsl.g:2491:4: (lv_name_2_0= RULE_ID )
                    // InternalDsl.g:2492:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_71); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getDynamicsAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDynamicsRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:2508:3: (otherlv_3= 'friction' ( (lv_friction_4_0= ruleURDFAttrSignedNumeric ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==69) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDsl.g:2509:4: otherlv_3= 'friction' ( (lv_friction_4_0= ruleURDFAttrSignedNumeric ) )
                    {
                    otherlv_3=(Token)match(input,69,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getDynamicsAccess().getFrictionKeyword_3_0());
                    			
                    // InternalDsl.g:2513:4: ( (lv_friction_4_0= ruleURDFAttrSignedNumeric ) )
                    // InternalDsl.g:2514:5: (lv_friction_4_0= ruleURDFAttrSignedNumeric )
                    {
                    // InternalDsl.g:2514:5: (lv_friction_4_0= ruleURDFAttrSignedNumeric )
                    // InternalDsl.g:2515:6: lv_friction_4_0= ruleURDFAttrSignedNumeric
                    {

                    						newCompositeNode(grammarAccess.getDynamicsAccess().getFrictionURDFAttrSignedNumericParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_72);
                    lv_friction_4_0=ruleURDFAttrSignedNumeric();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDynamicsRule());
                    						}
                    						set(
                    							current,
                    							"friction",
                    							lv_friction_4_0,
                    							"org.xtext.urdf.Dsl.URDFAttrSignedNumeric");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2533:3: (otherlv_5= 'damping' ( (lv_damping_6_0= ruleURDFAttrSignedNumeric ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==70) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDsl.g:2534:4: otherlv_5= 'damping' ( (lv_damping_6_0= ruleURDFAttrSignedNumeric ) )
                    {
                    otherlv_5=(Token)match(input,70,FOLLOW_26); 

                    				newLeafNode(otherlv_5, grammarAccess.getDynamicsAccess().getDampingKeyword_4_0());
                    			
                    // InternalDsl.g:2538:4: ( (lv_damping_6_0= ruleURDFAttrSignedNumeric ) )
                    // InternalDsl.g:2539:5: (lv_damping_6_0= ruleURDFAttrSignedNumeric )
                    {
                    // InternalDsl.g:2539:5: (lv_damping_6_0= ruleURDFAttrSignedNumeric )
                    // InternalDsl.g:2540:6: lv_damping_6_0= ruleURDFAttrSignedNumeric
                    {

                    						newCompositeNode(grammarAccess.getDynamicsAccess().getDampingURDFAttrSignedNumericParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_damping_6_0=ruleURDFAttrSignedNumeric();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDynamicsRule());
                    						}
                    						set(
                    							current,
                    							"damping",
                    							lv_damping_6_0,
                    							"org.xtext.urdf.Dsl.URDFAttrSignedNumeric");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDynamics"


    // $ANTLR start "entryRuleSafetyController"
    // InternalDsl.g:2562:1: entryRuleSafetyController returns [EObject current=null] : iv_ruleSafetyController= ruleSafetyController EOF ;
    public final EObject entryRuleSafetyController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSafetyController = null;


        try {
            // InternalDsl.g:2562:57: (iv_ruleSafetyController= ruleSafetyController EOF )
            // InternalDsl.g:2563:2: iv_ruleSafetyController= ruleSafetyController EOF
            {
             newCompositeNode(grammarAccess.getSafetyControllerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSafetyController=ruleSafetyController();

            state._fsp--;

             current =iv_ruleSafetyController; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSafetyController"


    // $ANTLR start "ruleSafetyController"
    // InternalDsl.g:2569:1: ruleSafetyController returns [EObject current=null] : (otherlv_0= 'SafetyController' ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= 'softLowerLimit' ( (lv_softLowerLimit_3_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_4= 'softUpperLimit' ( (lv_softUpperLimit_5_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_6= 'k_position' ( (lv_k_position_7_0= ruleURDFAttrSignedNumeric ) ) )? otherlv_8= 'k_velocity' ( (lv_k_velocity_9_0= ruleURDFAttrSignedNumeric ) ) ) ;
    public final EObject ruleSafetyController() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_softLowerLimit_3_0 = null;

        EObject lv_softUpperLimit_5_0 = null;

        EObject lv_k_position_7_0 = null;

        EObject lv_k_velocity_9_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2575:2: ( (otherlv_0= 'SafetyController' ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= 'softLowerLimit' ( (lv_softLowerLimit_3_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_4= 'softUpperLimit' ( (lv_softUpperLimit_5_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_6= 'k_position' ( (lv_k_position_7_0= ruleURDFAttrSignedNumeric ) ) )? otherlv_8= 'k_velocity' ( (lv_k_velocity_9_0= ruleURDFAttrSignedNumeric ) ) ) )
            // InternalDsl.g:2576:2: (otherlv_0= 'SafetyController' ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= 'softLowerLimit' ( (lv_softLowerLimit_3_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_4= 'softUpperLimit' ( (lv_softUpperLimit_5_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_6= 'k_position' ( (lv_k_position_7_0= ruleURDFAttrSignedNumeric ) ) )? otherlv_8= 'k_velocity' ( (lv_k_velocity_9_0= ruleURDFAttrSignedNumeric ) ) )
            {
            // InternalDsl.g:2576:2: (otherlv_0= 'SafetyController' ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= 'softLowerLimit' ( (lv_softLowerLimit_3_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_4= 'softUpperLimit' ( (lv_softUpperLimit_5_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_6= 'k_position' ( (lv_k_position_7_0= ruleURDFAttrSignedNumeric ) ) )? otherlv_8= 'k_velocity' ( (lv_k_velocity_9_0= ruleURDFAttrSignedNumeric ) ) )
            // InternalDsl.g:2577:3: otherlv_0= 'SafetyController' ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= 'softLowerLimit' ( (lv_softLowerLimit_3_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_4= 'softUpperLimit' ( (lv_softUpperLimit_5_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_6= 'k_position' ( (lv_k_position_7_0= ruleURDFAttrSignedNumeric ) ) )? otherlv_8= 'k_velocity' ( (lv_k_velocity_9_0= ruleURDFAttrSignedNumeric ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_73); 

            			newLeafNode(otherlv_0, grammarAccess.getSafetyControllerAccess().getSafetyControllerKeyword_0());
            		
            // InternalDsl.g:2581:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDsl.g:2582:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:2582:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:2583:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_74); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getSafetyControllerAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSafetyControllerRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:2599:3: (otherlv_2= 'softLowerLimit' ( (lv_softLowerLimit_3_0= ruleURDFAttrSignedNumeric ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==72) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDsl.g:2600:4: otherlv_2= 'softLowerLimit' ( (lv_softLowerLimit_3_0= ruleURDFAttrSignedNumeric ) )
                    {
                    otherlv_2=(Token)match(input,72,FOLLOW_26); 

                    				newLeafNode(otherlv_2, grammarAccess.getSafetyControllerAccess().getSoftLowerLimitKeyword_2_0());
                    			
                    // InternalDsl.g:2604:4: ( (lv_softLowerLimit_3_0= ruleURDFAttrSignedNumeric ) )
                    // InternalDsl.g:2605:5: (lv_softLowerLimit_3_0= ruleURDFAttrSignedNumeric )
                    {
                    // InternalDsl.g:2605:5: (lv_softLowerLimit_3_0= ruleURDFAttrSignedNumeric )
                    // InternalDsl.g:2606:6: lv_softLowerLimit_3_0= ruleURDFAttrSignedNumeric
                    {

                    						newCompositeNode(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitURDFAttrSignedNumericParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_75);
                    lv_softLowerLimit_3_0=ruleURDFAttrSignedNumeric();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSafetyControllerRule());
                    						}
                    						set(
                    							current,
                    							"softLowerLimit",
                    							lv_softLowerLimit_3_0,
                    							"org.xtext.urdf.Dsl.URDFAttrSignedNumeric");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2624:3: (otherlv_4= 'softUpperLimit' ( (lv_softUpperLimit_5_0= ruleURDFAttrSignedNumeric ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==73) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDsl.g:2625:4: otherlv_4= 'softUpperLimit' ( (lv_softUpperLimit_5_0= ruleURDFAttrSignedNumeric ) )
                    {
                    otherlv_4=(Token)match(input,73,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getSafetyControllerAccess().getSoftUpperLimitKeyword_3_0());
                    			
                    // InternalDsl.g:2629:4: ( (lv_softUpperLimit_5_0= ruleURDFAttrSignedNumeric ) )
                    // InternalDsl.g:2630:5: (lv_softUpperLimit_5_0= ruleURDFAttrSignedNumeric )
                    {
                    // InternalDsl.g:2630:5: (lv_softUpperLimit_5_0= ruleURDFAttrSignedNumeric )
                    // InternalDsl.g:2631:6: lv_softUpperLimit_5_0= ruleURDFAttrSignedNumeric
                    {

                    						newCompositeNode(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitURDFAttrSignedNumericParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_76);
                    lv_softUpperLimit_5_0=ruleURDFAttrSignedNumeric();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSafetyControllerRule());
                    						}
                    						set(
                    							current,
                    							"softUpperLimit",
                    							lv_softUpperLimit_5_0,
                    							"org.xtext.urdf.Dsl.URDFAttrSignedNumeric");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2649:3: (otherlv_6= 'k_position' ( (lv_k_position_7_0= ruleURDFAttrSignedNumeric ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==74) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalDsl.g:2650:4: otherlv_6= 'k_position' ( (lv_k_position_7_0= ruleURDFAttrSignedNumeric ) )
                    {
                    otherlv_6=(Token)match(input,74,FOLLOW_26); 

                    				newLeafNode(otherlv_6, grammarAccess.getSafetyControllerAccess().getK_positionKeyword_4_0());
                    			
                    // InternalDsl.g:2654:4: ( (lv_k_position_7_0= ruleURDFAttrSignedNumeric ) )
                    // InternalDsl.g:2655:5: (lv_k_position_7_0= ruleURDFAttrSignedNumeric )
                    {
                    // InternalDsl.g:2655:5: (lv_k_position_7_0= ruleURDFAttrSignedNumeric )
                    // InternalDsl.g:2656:6: lv_k_position_7_0= ruleURDFAttrSignedNumeric
                    {

                    						newCompositeNode(grammarAccess.getSafetyControllerAccess().getK_positionURDFAttrSignedNumericParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_77);
                    lv_k_position_7_0=ruleURDFAttrSignedNumeric();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSafetyControllerRule());
                    						}
                    						set(
                    							current,
                    							"k_position",
                    							lv_k_position_7_0,
                    							"org.xtext.urdf.Dsl.URDFAttrSignedNumeric");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,75,FOLLOW_26); 

            			newLeafNode(otherlv_8, grammarAccess.getSafetyControllerAccess().getK_velocityKeyword_5());
            		
            // InternalDsl.g:2678:3: ( (lv_k_velocity_9_0= ruleURDFAttrSignedNumeric ) )
            // InternalDsl.g:2679:4: (lv_k_velocity_9_0= ruleURDFAttrSignedNumeric )
            {
            // InternalDsl.g:2679:4: (lv_k_velocity_9_0= ruleURDFAttrSignedNumeric )
            // InternalDsl.g:2680:5: lv_k_velocity_9_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getSafetyControllerAccess().getK_velocityURDFAttrSignedNumericParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_k_velocity_9_0=ruleURDFAttrSignedNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSafetyControllerRule());
            					}
            					set(
            						current,
            						"k_velocity",
            						lv_k_velocity_9_0,
            						"org.xtext.urdf.Dsl.URDFAttrSignedNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSafetyController"


    // $ANTLR start "entryRuleURDFAttrSignedNumeric"
    // InternalDsl.g:2701:1: entryRuleURDFAttrSignedNumeric returns [EObject current=null] : iv_ruleURDFAttrSignedNumeric= ruleURDFAttrSignedNumeric EOF ;
    public final EObject entryRuleURDFAttrSignedNumeric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURDFAttrSignedNumeric = null;


        try {
            // InternalDsl.g:2701:62: (iv_ruleURDFAttrSignedNumeric= ruleURDFAttrSignedNumeric EOF )
            // InternalDsl.g:2702:2: iv_ruleURDFAttrSignedNumeric= ruleURDFAttrSignedNumeric EOF
            {
             newCompositeNode(grammarAccess.getURDFAttrSignedNumericRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleURDFAttrSignedNumeric=ruleURDFAttrSignedNumeric();

            state._fsp--;

             current =iv_ruleURDFAttrSignedNumeric; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleURDFAttrSignedNumeric"


    // $ANTLR start "ruleURDFAttrSignedNumeric"
    // InternalDsl.g:2708:1: ruleURDFAttrSignedNumeric returns [EObject current=null] : ( (lv_value_0_0= ruleSIGNED_NUMERIC ) ) ;
    public final EObject ruleURDFAttrSignedNumeric() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2714:2: ( ( (lv_value_0_0= ruleSIGNED_NUMERIC ) ) )
            // InternalDsl.g:2715:2: ( (lv_value_0_0= ruleSIGNED_NUMERIC ) )
            {
            // InternalDsl.g:2715:2: ( (lv_value_0_0= ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:2716:3: (lv_value_0_0= ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:2716:3: (lv_value_0_0= ruleSIGNED_NUMERIC )
            // InternalDsl.g:2717:4: lv_value_0_0= ruleSIGNED_NUMERIC
            {

            				newCompositeNode(grammarAccess.getURDFAttrSignedNumericAccess().getValueSIGNED_NUMERICParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleSIGNED_NUMERIC();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getURDFAttrSignedNumericRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.urdf.Dsl.SIGNED_NUMERIC");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleURDFAttrSignedNumeric"


    // $ANTLR start "entryRuleURDFAttrFloat"
    // InternalDsl.g:2737:1: entryRuleURDFAttrFloat returns [EObject current=null] : iv_ruleURDFAttrFloat= ruleURDFAttrFloat EOF ;
    public final EObject entryRuleURDFAttrFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURDFAttrFloat = null;


        try {
            // InternalDsl.g:2737:54: (iv_ruleURDFAttrFloat= ruleURDFAttrFloat EOF )
            // InternalDsl.g:2738:2: iv_ruleURDFAttrFloat= ruleURDFAttrFloat EOF
            {
             newCompositeNode(grammarAccess.getURDFAttrFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleURDFAttrFloat=ruleURDFAttrFloat();

            state._fsp--;

             current =iv_ruleURDFAttrFloat; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleURDFAttrFloat"


    // $ANTLR start "ruleURDFAttrFloat"
    // InternalDsl.g:2744:1: ruleURDFAttrFloat returns [EObject current=null] : ( (lv_value_0_0= ruleFLOAT ) ) ;
    public final EObject ruleURDFAttrFloat() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2750:2: ( ( (lv_value_0_0= ruleFLOAT ) ) )
            // InternalDsl.g:2751:2: ( (lv_value_0_0= ruleFLOAT ) )
            {
            // InternalDsl.g:2751:2: ( (lv_value_0_0= ruleFLOAT ) )
            // InternalDsl.g:2752:3: (lv_value_0_0= ruleFLOAT )
            {
            // InternalDsl.g:2752:3: (lv_value_0_0= ruleFLOAT )
            // InternalDsl.g:2753:4: lv_value_0_0= ruleFLOAT
            {

            				newCompositeNode(grammarAccess.getURDFAttrFloatAccess().getValueFLOATParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleFLOAT();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getURDFAttrFloatRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.urdf.Dsl.FLOAT");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleURDFAttrFloat"


    // $ANTLR start "entryRuleURDFAttrINT"
    // InternalDsl.g:2773:1: entryRuleURDFAttrINT returns [EObject current=null] : iv_ruleURDFAttrINT= ruleURDFAttrINT EOF ;
    public final EObject entryRuleURDFAttrINT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURDFAttrINT = null;


        try {
            // InternalDsl.g:2773:52: (iv_ruleURDFAttrINT= ruleURDFAttrINT EOF )
            // InternalDsl.g:2774:2: iv_ruleURDFAttrINT= ruleURDFAttrINT EOF
            {
             newCompositeNode(grammarAccess.getURDFAttrINTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleURDFAttrINT=ruleURDFAttrINT();

            state._fsp--;

             current =iv_ruleURDFAttrINT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleURDFAttrINT"


    // $ANTLR start "ruleURDFAttrINT"
    // InternalDsl.g:2780:1: ruleURDFAttrINT returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleURDFAttrINT() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDsl.g:2786:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalDsl.g:2787:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalDsl.g:2787:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalDsl.g:2788:3: (lv_value_0_0= RULE_INT )
            {
            // InternalDsl.g:2788:3: (lv_value_0_0= RULE_INT )
            // InternalDsl.g:2789:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getURDFAttrINTAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getURDFAttrINTRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleURDFAttrINT"


    // $ANTLR start "entryRuleURDFAttrNumeric"
    // InternalDsl.g:2808:1: entryRuleURDFAttrNumeric returns [EObject current=null] : iv_ruleURDFAttrNumeric= ruleURDFAttrNumeric EOF ;
    public final EObject entryRuleURDFAttrNumeric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURDFAttrNumeric = null;


        try {
            // InternalDsl.g:2808:56: (iv_ruleURDFAttrNumeric= ruleURDFAttrNumeric EOF )
            // InternalDsl.g:2809:2: iv_ruleURDFAttrNumeric= ruleURDFAttrNumeric EOF
            {
             newCompositeNode(grammarAccess.getURDFAttrNumericRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleURDFAttrNumeric=ruleURDFAttrNumeric();

            state._fsp--;

             current =iv_ruleURDFAttrNumeric; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleURDFAttrNumeric"


    // $ANTLR start "ruleURDFAttrNumeric"
    // InternalDsl.g:2815:1: ruleURDFAttrNumeric returns [EObject current=null] : ( (lv_value_0_0= ruleNUMERIC ) ) ;
    public final EObject ruleURDFAttrNumeric() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2821:2: ( ( (lv_value_0_0= ruleNUMERIC ) ) )
            // InternalDsl.g:2822:2: ( (lv_value_0_0= ruleNUMERIC ) )
            {
            // InternalDsl.g:2822:2: ( (lv_value_0_0= ruleNUMERIC ) )
            // InternalDsl.g:2823:3: (lv_value_0_0= ruleNUMERIC )
            {
            // InternalDsl.g:2823:3: (lv_value_0_0= ruleNUMERIC )
            // InternalDsl.g:2824:4: lv_value_0_0= ruleNUMERIC
            {

            				newCompositeNode(grammarAccess.getURDFAttrNumericAccess().getValueNUMERICParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleNUMERIC();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getURDFAttrNumericRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.urdf.Dsl.NUMERIC");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleURDFAttrNumeric"


    // $ANTLR start "entryRuleURDFAttrSTRING"
    // InternalDsl.g:2844:1: entryRuleURDFAttrSTRING returns [EObject current=null] : iv_ruleURDFAttrSTRING= ruleURDFAttrSTRING EOF ;
    public final EObject entryRuleURDFAttrSTRING() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURDFAttrSTRING = null;


        try {
            // InternalDsl.g:2844:55: (iv_ruleURDFAttrSTRING= ruleURDFAttrSTRING EOF )
            // InternalDsl.g:2845:2: iv_ruleURDFAttrSTRING= ruleURDFAttrSTRING EOF
            {
             newCompositeNode(grammarAccess.getURDFAttrSTRINGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleURDFAttrSTRING=ruleURDFAttrSTRING();

            state._fsp--;

             current =iv_ruleURDFAttrSTRING; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleURDFAttrSTRING"


    // $ANTLR start "ruleURDFAttrSTRING"
    // InternalDsl.g:2851:1: ruleURDFAttrSTRING returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleURDFAttrSTRING() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDsl.g:2857:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalDsl.g:2858:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalDsl.g:2858:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalDsl.g:2859:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalDsl.g:2859:3: (lv_value_0_0= RULE_STRING )
            // InternalDsl.g:2860:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getURDFAttrSTRINGAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getURDFAttrSTRINGRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleURDFAttrSTRING"


    // $ANTLR start "entryRuleFLOAT"
    // InternalDsl.g:2879:1: entryRuleFLOAT returns [String current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final String entryRuleFLOAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT = null;


        try {
            // InternalDsl.g:2879:45: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalDsl.g:2880:2: iv_ruleFLOAT= ruleFLOAT EOF
            {
             newCompositeNode(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFLOAT=ruleFLOAT();

            state._fsp--;

             current =iv_ruleFLOAT.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalDsl.g:2886:1: ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalDsl.g:2892:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalDsl.g:2893:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalDsl.g:2893:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalDsl.g:2894:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_78); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,76,FOLLOW_56); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFLOATAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "entryRuleSCIENTIFIC"
    // InternalDsl.g:2917:1: entryRuleSCIENTIFIC returns [String current=null] : iv_ruleSCIENTIFIC= ruleSCIENTIFIC EOF ;
    public final String entryRuleSCIENTIFIC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSCIENTIFIC = null;


        try {
            // InternalDsl.g:2917:50: (iv_ruleSCIENTIFIC= ruleSCIENTIFIC EOF )
            // InternalDsl.g:2918:2: iv_ruleSCIENTIFIC= ruleSCIENTIFIC EOF
            {
             newCompositeNode(grammarAccess.getSCIENTIFICRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSCIENTIFIC=ruleSCIENTIFIC();

            state._fsp--;

             current =iv_ruleSCIENTIFIC.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSCIENTIFIC"


    // $ANTLR start "ruleSCIENTIFIC"
    // InternalDsl.g:2924:1: ruleSCIENTIFIC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FLOAT_0= ruleFLOAT kw= 'e' (kw= '+' | kw= '-' )? this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSCIENTIFIC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_4=null;
        AntlrDatatypeRuleToken this_FLOAT_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2930:2: ( (this_FLOAT_0= ruleFLOAT kw= 'e' (kw= '+' | kw= '-' )? this_INT_4= RULE_INT ) )
            // InternalDsl.g:2931:2: (this_FLOAT_0= ruleFLOAT kw= 'e' (kw= '+' | kw= '-' )? this_INT_4= RULE_INT )
            {
            // InternalDsl.g:2931:2: (this_FLOAT_0= ruleFLOAT kw= 'e' (kw= '+' | kw= '-' )? this_INT_4= RULE_INT )
            // InternalDsl.g:2932:3: this_FLOAT_0= ruleFLOAT kw= 'e' (kw= '+' | kw= '-' )? this_INT_4= RULE_INT
            {

            			newCompositeNode(grammarAccess.getSCIENTIFICAccess().getFLOATParserRuleCall_0());
            		
            pushFollow(FOLLOW_79);
            this_FLOAT_0=ruleFLOAT();

            state._fsp--;


            			current.merge(this_FLOAT_0);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,77,FOLLOW_80); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getSCIENTIFICAccess().getEKeyword_1());
            		
            // InternalDsl.g:2947:3: (kw= '+' | kw= '-' )?
            int alt50=3;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==78) ) {
                alt50=1;
            }
            else if ( (LA50_0==79) ) {
                alt50=2;
            }
            switch (alt50) {
                case 1 :
                    // InternalDsl.g:2948:4: kw= '+'
                    {
                    kw=(Token)match(input,78,FOLLOW_56); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSCIENTIFICAccess().getPlusSignKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDsl.g:2954:4: kw= '-'
                    {
                    kw=(Token)match(input,79,FOLLOW_56); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSCIENTIFICAccess().getHyphenMinusKeyword_2_1());
                    			

                    }
                    break;

            }

            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_4);
            		

            			newLeafNode(this_INT_4, grammarAccess.getSCIENTIFICAccess().getINTTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSCIENTIFIC"


    // $ANTLR start "entryRuleSIGNED_NUMERIC"
    // InternalDsl.g:2971:1: entryRuleSIGNED_NUMERIC returns [String current=null] : iv_ruleSIGNED_NUMERIC= ruleSIGNED_NUMERIC EOF ;
    public final String entryRuleSIGNED_NUMERIC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSIGNED_NUMERIC = null;


        try {
            // InternalDsl.g:2971:54: (iv_ruleSIGNED_NUMERIC= ruleSIGNED_NUMERIC EOF )
            // InternalDsl.g:2972:2: iv_ruleSIGNED_NUMERIC= ruleSIGNED_NUMERIC EOF
            {
             newCompositeNode(grammarAccess.getSIGNED_NUMERICRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSIGNED_NUMERIC=ruleSIGNED_NUMERIC();

            state._fsp--;

             current =iv_ruleSIGNED_NUMERIC.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSIGNED_NUMERIC"


    // $ANTLR start "ruleSIGNED_NUMERIC"
    // InternalDsl.g:2978:1: ruleSIGNED_NUMERIC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT | this_FLOAT_2= ruleFLOAT | this_SCIENTIFIC_3= ruleSCIENTIFIC ) ) ;
    public final AntlrDatatypeRuleToken ruleSIGNED_NUMERIC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        AntlrDatatypeRuleToken this_FLOAT_2 = null;

        AntlrDatatypeRuleToken this_SCIENTIFIC_3 = null;



        	enterRule();

        try {
            // InternalDsl.g:2984:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT | this_FLOAT_2= ruleFLOAT | this_SCIENTIFIC_3= ruleSCIENTIFIC ) ) )
            // InternalDsl.g:2985:2: ( (kw= '-' )? (this_INT_1= RULE_INT | this_FLOAT_2= ruleFLOAT | this_SCIENTIFIC_3= ruleSCIENTIFIC ) )
            {
            // InternalDsl.g:2985:2: ( (kw= '-' )? (this_INT_1= RULE_INT | this_FLOAT_2= ruleFLOAT | this_SCIENTIFIC_3= ruleSCIENTIFIC ) )
            // InternalDsl.g:2986:3: (kw= '-' )? (this_INT_1= RULE_INT | this_FLOAT_2= ruleFLOAT | this_SCIENTIFIC_3= ruleSCIENTIFIC )
            {
            // InternalDsl.g:2986:3: (kw= '-' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==79) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDsl.g:2987:4: kw= '-'
                    {
                    kw=(Token)match(input,79,FOLLOW_26); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSIGNED_NUMERICAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalDsl.g:2993:3: (this_INT_1= RULE_INT | this_FLOAT_2= ruleFLOAT | this_SCIENTIFIC_3= ruleSCIENTIFIC )
            int alt52=3;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_INT) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==EOF||(LA52_1>=12 && LA52_1<=13)||(LA52_1>=15 && LA52_1<=16)||LA52_1==24||(LA52_1>=27 && LA52_1<=32)||LA52_1==43||(LA52_1>=46 && LA52_1<=51)||(LA52_1>=61 && LA52_1<=65)||(LA52_1>=67 && LA52_1<=68)||(LA52_1>=70 && LA52_1<=71)||(LA52_1>=73 && LA52_1<=75)) ) {
                    alt52=1;
                }
                else if ( (LA52_1==76) ) {
                    int LA52_3 = input.LA(3);

                    if ( (LA52_3==RULE_INT) ) {
                        int LA52_4 = input.LA(4);

                        if ( (LA52_4==EOF||(LA52_4>=12 && LA52_4<=13)||(LA52_4>=15 && LA52_4<=16)||LA52_4==24||(LA52_4>=27 && LA52_4<=32)||LA52_4==43||(LA52_4>=46 && LA52_4<=51)||(LA52_4>=61 && LA52_4<=65)||(LA52_4>=67 && LA52_4<=68)||(LA52_4>=70 && LA52_4<=71)||(LA52_4>=73 && LA52_4<=75)) ) {
                            alt52=2;
                        }
                        else if ( (LA52_4==77) ) {
                            alt52=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 52, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalDsl.g:2994:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getSIGNED_NUMERICAccess().getINTTerminalRuleCall_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDsl.g:3002:4: this_FLOAT_2= ruleFLOAT
                    {

                    				newCompositeNode(grammarAccess.getSIGNED_NUMERICAccess().getFLOATParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_FLOAT_2=ruleFLOAT();

                    state._fsp--;


                    				current.merge(this_FLOAT_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalDsl.g:3013:4: this_SCIENTIFIC_3= ruleSCIENTIFIC
                    {

                    				newCompositeNode(grammarAccess.getSIGNED_NUMERICAccess().getSCIENTIFICParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_SCIENTIFIC_3=ruleSCIENTIFIC();

                    state._fsp--;


                    				current.merge(this_SCIENTIFIC_3);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSIGNED_NUMERIC"


    // $ANTLR start "entryRuleNUMERIC"
    // InternalDsl.g:3028:1: entryRuleNUMERIC returns [String current=null] : iv_ruleNUMERIC= ruleNUMERIC EOF ;
    public final String entryRuleNUMERIC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMERIC = null;


        try {
            // InternalDsl.g:3028:47: (iv_ruleNUMERIC= ruleNUMERIC EOF )
            // InternalDsl.g:3029:2: iv_ruleNUMERIC= ruleNUMERIC EOF
            {
             newCompositeNode(grammarAccess.getNUMERICRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNUMERIC=ruleNUMERIC();

            state._fsp--;

             current =iv_ruleNUMERIC.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNUMERIC"


    // $ANTLR start "ruleNUMERIC"
    // InternalDsl.g:3035:1: ruleNUMERIC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT | this_SCIENTIFIC_2= ruleSCIENTIFIC ) ;
    public final AntlrDatatypeRuleToken ruleNUMERIC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        AntlrDatatypeRuleToken this_FLOAT_1 = null;

        AntlrDatatypeRuleToken this_SCIENTIFIC_2 = null;



        	enterRule();

        try {
            // InternalDsl.g:3041:2: ( (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT | this_SCIENTIFIC_2= ruleSCIENTIFIC ) )
            // InternalDsl.g:3042:2: (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT | this_SCIENTIFIC_2= ruleSCIENTIFIC )
            {
            // InternalDsl.g:3042:2: (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT | this_SCIENTIFIC_2= ruleSCIENTIFIC )
            int alt53=3;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_INT) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==76) ) {
                    int LA53_2 = input.LA(3);

                    if ( (LA53_2==RULE_INT) ) {
                        int LA53_4 = input.LA(4);

                        if ( (LA53_4==77) ) {
                            alt53=3;
                        }
                        else if ( (LA53_4==EOF||(LA53_4>=12 && LA53_4<=13)||(LA53_4>=15 && LA53_4<=16)||LA53_4==24||(LA53_4>=32 && LA53_4<=33)||(LA53_4>=35 && LA53_4<=37)||LA53_4==39||(LA53_4>=42 && LA53_4<=44)) ) {
                            alt53=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 53, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA53_1==EOF||(LA53_1>=12 && LA53_1<=13)||(LA53_1>=15 && LA53_1<=16)||LA53_1==24||(LA53_1>=32 && LA53_1<=33)||(LA53_1>=35 && LA53_1<=37)||LA53_1==39||(LA53_1>=42 && LA53_1<=44)) ) {
                    alt53=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalDsl.g:3043:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getNUMERICAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:3051:3: this_FLOAT_1= ruleFLOAT
                    {

                    			newCompositeNode(grammarAccess.getNUMERICAccess().getFLOATParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FLOAT_1=ruleFLOAT();

                    state._fsp--;


                    			current.merge(this_FLOAT_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:3062:3: this_SCIENTIFIC_2= ruleSCIENTIFIC
                    {

                    			newCompositeNode(grammarAccess.getNUMERICAccess().getSCIENTIFICParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SCIENTIFIC_2=ruleSCIENTIFIC();

                    state._fsp--;


                    			current.merge(this_SCIENTIFIC_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNUMERIC"


    // $ANTLR start "ruleJointType"
    // InternalDsl.g:3076:1: ruleJointType returns [Enumerator current=null] : ( (enumLiteral_0= 'Fixed' ) | (enumLiteral_1= 'Revolute' ) | (enumLiteral_2= 'Prismatic' ) | (enumLiteral_3= 'Continuous' ) ) ;
    public final Enumerator ruleJointType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDsl.g:3082:2: ( ( (enumLiteral_0= 'Fixed' ) | (enumLiteral_1= 'Revolute' ) | (enumLiteral_2= 'Prismatic' ) | (enumLiteral_3= 'Continuous' ) ) )
            // InternalDsl.g:3083:2: ( (enumLiteral_0= 'Fixed' ) | (enumLiteral_1= 'Revolute' ) | (enumLiteral_2= 'Prismatic' ) | (enumLiteral_3= 'Continuous' ) )
            {
            // InternalDsl.g:3083:2: ( (enumLiteral_0= 'Fixed' ) | (enumLiteral_1= 'Revolute' ) | (enumLiteral_2= 'Prismatic' ) | (enumLiteral_3= 'Continuous' ) )
            int alt54=4;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt54=1;
                }
                break;
            case 81:
                {
                alt54=2;
                }
                break;
            case 82:
                {
                alt54=3;
                }
                break;
            case 83:
                {
                alt54=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalDsl.g:3084:3: (enumLiteral_0= 'Fixed' )
                    {
                    // InternalDsl.g:3084:3: (enumLiteral_0= 'Fixed' )
                    // InternalDsl.g:3085:4: enumLiteral_0= 'Fixed'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:3092:3: (enumLiteral_1= 'Revolute' )
                    {
                    // InternalDsl.g:3092:3: (enumLiteral_1= 'Revolute' )
                    // InternalDsl.g:3093:4: enumLiteral_1= 'Revolute'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:3100:3: (enumLiteral_2= 'Prismatic' )
                    {
                    // InternalDsl.g:3100:3: (enumLiteral_2= 'Prismatic' )
                    // InternalDsl.g:3101:4: enumLiteral_2= 'Prismatic'
                    {
                    enumLiteral_2=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:3108:3: (enumLiteral_3= 'Continuous' )
                    {
                    // InternalDsl.g:3108:3: (enumLiteral_3= 'Continuous' )
                    // InternalDsl.g:3109:4: enumLiteral_3= 'Continuous'
                    {
                    enumLiteral_3=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getContinuousEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getJointTypeAccess().getContinuousEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJointType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000001B002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000F00002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000080101004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000080101000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000080101000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000080100000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x00000000000F0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0800000000004000L,0x0000000000000093L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000093L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000093L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000092L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000090L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000020L,0x0000000000008000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000014A200000012L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000014A200000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0007000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0040000000000010L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x1000000000000010L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x8000000000000020L,0x0000000000008000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000022L,0x0000000000008000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000012L,0x000000000000000CL});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000060L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000F00L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000020L,0x000000000000C000L});

}