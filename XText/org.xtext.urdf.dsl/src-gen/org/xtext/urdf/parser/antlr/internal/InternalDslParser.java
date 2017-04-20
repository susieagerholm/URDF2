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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RobotName'", "','", "'Link'", "'inertial'", "'visuals'", "'collision'", "'Joint'", "'Type'", "'ChildOf'", "'ParentOf'", "'limit'", "'axis'", "'origin'", "'callibration'", "'dynamics'", "'mimic'", "'safetycontroller'", "'mass'", "'inertia'", "'material'", "'geometry'", "'x'", "'y'", "'z'", "'Roll'", "'Pitch'", "'Yaw'", "'Mass'", "'Inertia'", "'Material'", "'Geometry'", "'Color'", "'Texture'", "'Box'", "'Cylinder'", "'Mesh'", "'Sphere'", "'Lower'", "'Upper'", "'Effort'", "'Velocity'", "'Rising'", "'Falling'", "'Friction'", "'Damping'", "'Multiplier'", "'OffSet'", "'SoftLowerLimit'", "'SoftUpperLimit'", "'k_position'", "'k_velocity'", "'Revolute'", "'Continous'", "'Fixed'", "'Prismatic'"
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    // InternalDsl.g:72:1: ruleRobot returns [EObject current=null] : (otherlv_0= 'RobotName' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_link_2_0= ruleLink ) ) (otherlv_3= ',' ( (lv_link_4_0= ruleLink ) ) )* ( ( (lv_joint_5_0= ruleJoint ) ) ( (lv_joint_6_0= ruleJoint ) )* )? ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_link_2_0 = null;

        EObject lv_link_4_0 = null;

        EObject lv_joint_5_0 = null;

        EObject lv_joint_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:78:2: ( (otherlv_0= 'RobotName' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_link_2_0= ruleLink ) ) (otherlv_3= ',' ( (lv_link_4_0= ruleLink ) ) )* ( ( (lv_joint_5_0= ruleJoint ) ) ( (lv_joint_6_0= ruleJoint ) )* )? ) )
            // InternalDsl.g:79:2: (otherlv_0= 'RobotName' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_link_2_0= ruleLink ) ) (otherlv_3= ',' ( (lv_link_4_0= ruleLink ) ) )* ( ( (lv_joint_5_0= ruleJoint ) ) ( (lv_joint_6_0= ruleJoint ) )* )? )
            {
            // InternalDsl.g:79:2: (otherlv_0= 'RobotName' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_link_2_0= ruleLink ) ) (otherlv_3= ',' ( (lv_link_4_0= ruleLink ) ) )* ( ( (lv_joint_5_0= ruleJoint ) ) ( (lv_joint_6_0= ruleJoint ) )* )? )
            // InternalDsl.g:80:3: otherlv_0= 'RobotName' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_link_2_0= ruleLink ) ) (otherlv_3= ',' ( (lv_link_4_0= ruleLink ) ) )* ( ( (lv_joint_5_0= ruleJoint ) ) ( (lv_joint_6_0= ruleJoint ) )* )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRobotAccess().getRobotNameKeyword_0());
            		
            // InternalDsl.g:84:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDsl.g:85:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDsl.g:85:4: (lv_name_1_0= RULE_STRING )
            // InternalDsl.g:86:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRobotAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDsl.g:102:3: ( (lv_link_2_0= ruleLink ) )
            // InternalDsl.g:103:4: (lv_link_2_0= ruleLink )
            {
            // InternalDsl.g:103:4: (lv_link_2_0= ruleLink )
            // InternalDsl.g:104:5: lv_link_2_0= ruleLink
            {

            					newCompositeNode(grammarAccess.getRobotAccess().getLinkLinkParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_link_2_0=ruleLink();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotRule());
            					}
            					add(
            						current,
            						"link",
            						lv_link_2_0,
            						"org.xtext.urdf.Dsl.Link");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:121:3: (otherlv_3= ',' ( (lv_link_4_0= ruleLink ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:122:4: otherlv_3= ',' ( (lv_link_4_0= ruleLink ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getRobotAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalDsl.g:126:4: ( (lv_link_4_0= ruleLink ) )
            	    // InternalDsl.g:127:5: (lv_link_4_0= ruleLink )
            	    {
            	    // InternalDsl.g:127:5: (lv_link_4_0= ruleLink )
            	    // InternalDsl.g:128:6: lv_link_4_0= ruleLink
            	    {

            	    						newCompositeNode(grammarAccess.getRobotAccess().getLinkLinkParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
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

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalDsl.g:146:3: ( ( (lv_joint_5_0= ruleJoint ) ) ( (lv_joint_6_0= ruleJoint ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:147:4: ( (lv_joint_5_0= ruleJoint ) ) ( (lv_joint_6_0= ruleJoint ) )*
                    {
                    // InternalDsl.g:147:4: ( (lv_joint_5_0= ruleJoint ) )
                    // InternalDsl.g:148:5: (lv_joint_5_0= ruleJoint )
                    {
                    // InternalDsl.g:148:5: (lv_joint_5_0= ruleJoint )
                    // InternalDsl.g:149:6: lv_joint_5_0= ruleJoint
                    {

                    						newCompositeNode(grammarAccess.getRobotAccess().getJointJointParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    // InternalDsl.g:166:4: ( (lv_joint_6_0= ruleJoint ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==17) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalDsl.g:167:5: (lv_joint_6_0= ruleJoint )
                    	    {
                    	    // InternalDsl.g:167:5: (lv_joint_6_0= ruleJoint )
                    	    // InternalDsl.g:168:6: lv_joint_6_0= ruleJoint
                    	    {

                    	    						newCompositeNode(grammarAccess.getRobotAccess().getJointJointParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_joint_6_0=ruleJoint();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"joint",
                    	    							lv_joint_6_0,
                    	    							"org.xtext.urdf.Dsl.Joint");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


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
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleMaterial"
    // InternalDsl.g:190:1: entryRuleMaterial returns [EObject current=null] : iv_ruleMaterial= ruleMaterial EOF ;
    public final EObject entryRuleMaterial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaterial = null;


        try {
            // InternalDsl.g:190:49: (iv_ruleMaterial= ruleMaterial EOF )
            // InternalDsl.g:191:2: iv_ruleMaterial= ruleMaterial EOF
            {
             newCompositeNode(grammarAccess.getMaterialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaterial=ruleMaterial();

            state._fsp--;

             current =iv_ruleMaterial; 
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
    // $ANTLR end "entryRuleMaterial"


    // $ANTLR start "ruleMaterial"
    // InternalDsl.g:197:1: ruleMaterial returns [EObject current=null] : (this_Material_Impl_0= ruleMaterial_Impl | this_Color_1= ruleColor | this_Texture_2= ruleTexture ) ;
    public final EObject ruleMaterial() throws RecognitionException {
        EObject current = null;

        EObject this_Material_Impl_0 = null;

        EObject this_Color_1 = null;

        EObject this_Texture_2 = null;



        	enterRule();

        try {
            // InternalDsl.g:203:2: ( (this_Material_Impl_0= ruleMaterial_Impl | this_Color_1= ruleColor | this_Texture_2= ruleTexture ) )
            // InternalDsl.g:204:2: (this_Material_Impl_0= ruleMaterial_Impl | this_Color_1= ruleColor | this_Texture_2= ruleTexture )
            {
            // InternalDsl.g:204:2: (this_Material_Impl_0= ruleMaterial_Impl | this_Color_1= ruleColor | this_Texture_2= ruleTexture )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt4=1;
                }
                break;
            case 42:
                {
                alt4=2;
                }
                break;
            case 43:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDsl.g:205:3: this_Material_Impl_0= ruleMaterial_Impl
                    {

                    			newCompositeNode(grammarAccess.getMaterialAccess().getMaterial_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Material_Impl_0=ruleMaterial_Impl();

                    state._fsp--;


                    			current = this_Material_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:214:3: this_Color_1= ruleColor
                    {

                    			newCompositeNode(grammarAccess.getMaterialAccess().getColorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Color_1=ruleColor();

                    state._fsp--;


                    			current = this_Color_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:223:3: this_Texture_2= ruleTexture
                    {

                    			newCompositeNode(grammarAccess.getMaterialAccess().getTextureParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Texture_2=ruleTexture();

                    state._fsp--;


                    			current = this_Texture_2;
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
    // $ANTLR end "ruleMaterial"


    // $ANTLR start "entryRuleGeometry"
    // InternalDsl.g:235:1: entryRuleGeometry returns [EObject current=null] : iv_ruleGeometry= ruleGeometry EOF ;
    public final EObject entryRuleGeometry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeometry = null;


        try {
            // InternalDsl.g:235:49: (iv_ruleGeometry= ruleGeometry EOF )
            // InternalDsl.g:236:2: iv_ruleGeometry= ruleGeometry EOF
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
    // InternalDsl.g:242:1: ruleGeometry returns [EObject current=null] : (this_Geometry_Impl_0= ruleGeometry_Impl | this_Box_1= ruleBox | this_Cylinder_2= ruleCylinder | this_Mesh_3= ruleMesh | this_Sphere_4= ruleSphere ) ;
    public final EObject ruleGeometry() throws RecognitionException {
        EObject current = null;

        EObject this_Geometry_Impl_0 = null;

        EObject this_Box_1 = null;

        EObject this_Cylinder_2 = null;

        EObject this_Mesh_3 = null;

        EObject this_Sphere_4 = null;



        	enterRule();

        try {
            // InternalDsl.g:248:2: ( (this_Geometry_Impl_0= ruleGeometry_Impl | this_Box_1= ruleBox | this_Cylinder_2= ruleCylinder | this_Mesh_3= ruleMesh | this_Sphere_4= ruleSphere ) )
            // InternalDsl.g:249:2: (this_Geometry_Impl_0= ruleGeometry_Impl | this_Box_1= ruleBox | this_Cylinder_2= ruleCylinder | this_Mesh_3= ruleMesh | this_Sphere_4= ruleSphere )
            {
            // InternalDsl.g:249:2: (this_Geometry_Impl_0= ruleGeometry_Impl | this_Box_1= ruleBox | this_Cylinder_2= ruleCylinder | this_Mesh_3= ruleMesh | this_Sphere_4= ruleSphere )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt5=1;
                }
                break;
            case 44:
                {
                alt5=2;
                }
                break;
            case 45:
                {
                alt5=3;
                }
                break;
            case 46:
                {
                alt5=4;
                }
                break;
            case 47:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDsl.g:250:3: this_Geometry_Impl_0= ruleGeometry_Impl
                    {

                    			newCompositeNode(grammarAccess.getGeometryAccess().getGeometry_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Geometry_Impl_0=ruleGeometry_Impl();

                    state._fsp--;


                    			current = this_Geometry_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:259:3: this_Box_1= ruleBox
                    {

                    			newCompositeNode(grammarAccess.getGeometryAccess().getBoxParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Box_1=ruleBox();

                    state._fsp--;


                    			current = this_Box_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:268:3: this_Cylinder_2= ruleCylinder
                    {

                    			newCompositeNode(grammarAccess.getGeometryAccess().getCylinderParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Cylinder_2=ruleCylinder();

                    state._fsp--;


                    			current = this_Cylinder_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDsl.g:277:3: this_Mesh_3= ruleMesh
                    {

                    			newCompositeNode(grammarAccess.getGeometryAccess().getMeshParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mesh_3=ruleMesh();

                    state._fsp--;


                    			current = this_Mesh_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDsl.g:286:3: this_Sphere_4= ruleSphere
                    {

                    			newCompositeNode(grammarAccess.getGeometryAccess().getSphereParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sphere_4=ruleSphere();

                    state._fsp--;


                    			current = this_Sphere_4;
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


    // $ANTLR start "entryRuleLink"
    // InternalDsl.g:298:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalDsl.g:298:45: (iv_ruleLink= ruleLink EOF )
            // InternalDsl.g:299:2: iv_ruleLink= ruleLink EOF
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
    // InternalDsl.g:305:1: ruleLink returns [EObject current=null] : ( () otherlv_1= 'Link' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'inertial' ( (lv_inertial_4_0= ruleInertial ) ) ( (lv_inertial_5_0= ruleInertial ) )* )? (otherlv_6= 'visuals' ( (lv_visuals_7_0= ruleVisual ) ) ( (lv_visuals_8_0= ruleVisual ) )* )? (otherlv_9= 'collision' ( (lv_collision_10_0= ruleCollision ) ) ( (lv_collision_11_0= ruleCollision ) )* )? ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_inertial_4_0 = null;

        EObject lv_inertial_5_0 = null;

        EObject lv_visuals_7_0 = null;

        EObject lv_visuals_8_0 = null;

        EObject lv_collision_10_0 = null;

        EObject lv_collision_11_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:311:2: ( ( () otherlv_1= 'Link' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'inertial' ( (lv_inertial_4_0= ruleInertial ) ) ( (lv_inertial_5_0= ruleInertial ) )* )? (otherlv_6= 'visuals' ( (lv_visuals_7_0= ruleVisual ) ) ( (lv_visuals_8_0= ruleVisual ) )* )? (otherlv_9= 'collision' ( (lv_collision_10_0= ruleCollision ) ) ( (lv_collision_11_0= ruleCollision ) )* )? ) )
            // InternalDsl.g:312:2: ( () otherlv_1= 'Link' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'inertial' ( (lv_inertial_4_0= ruleInertial ) ) ( (lv_inertial_5_0= ruleInertial ) )* )? (otherlv_6= 'visuals' ( (lv_visuals_7_0= ruleVisual ) ) ( (lv_visuals_8_0= ruleVisual ) )* )? (otherlv_9= 'collision' ( (lv_collision_10_0= ruleCollision ) ) ( (lv_collision_11_0= ruleCollision ) )* )? )
            {
            // InternalDsl.g:312:2: ( () otherlv_1= 'Link' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'inertial' ( (lv_inertial_4_0= ruleInertial ) ) ( (lv_inertial_5_0= ruleInertial ) )* )? (otherlv_6= 'visuals' ( (lv_visuals_7_0= ruleVisual ) ) ( (lv_visuals_8_0= ruleVisual ) )* )? (otherlv_9= 'collision' ( (lv_collision_10_0= ruleCollision ) ) ( (lv_collision_11_0= ruleCollision ) )* )? )
            // InternalDsl.g:313:3: () otherlv_1= 'Link' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'inertial' ( (lv_inertial_4_0= ruleInertial ) ) ( (lv_inertial_5_0= ruleInertial ) )* )? (otherlv_6= 'visuals' ( (lv_visuals_7_0= ruleVisual ) ) ( (lv_visuals_8_0= ruleVisual ) )* )? (otherlv_9= 'collision' ( (lv_collision_10_0= ruleCollision ) ) ( (lv_collision_11_0= ruleCollision ) )* )?
            {
            // InternalDsl.g:313:3: ()
            // InternalDsl.g:314:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLinkAccess().getLinkAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getLinkAccess().getLinkKeyword_1());
            		
            // InternalDsl.g:324:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:325:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:325:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:326:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDsl.g:342:3: (otherlv_3= 'inertial' ( (lv_inertial_4_0= ruleInertial ) ) ( (lv_inertial_5_0= ruleInertial ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:343:4: otherlv_3= 'inertial' ( (lv_inertial_4_0= ruleInertial ) ) ( (lv_inertial_5_0= ruleInertial ) )*
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getInertialKeyword_3_0());
                    			
                    // InternalDsl.g:347:4: ( (lv_inertial_4_0= ruleInertial ) )
                    // InternalDsl.g:348:5: (lv_inertial_4_0= ruleInertial )
                    {
                    // InternalDsl.g:348:5: (lv_inertial_4_0= ruleInertial )
                    // InternalDsl.g:349:6: lv_inertial_4_0= ruleInertial
                    {

                    						newCompositeNode(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_inertial_4_0=ruleInertial();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkRule());
                    						}
                    						add(
                    							current,
                    							"inertial",
                    							lv_inertial_4_0,
                    							"org.xtext.urdf.Dsl.Inertial");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:366:4: ( (lv_inertial_5_0= ruleInertial ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==23) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalDsl.g:367:5: (lv_inertial_5_0= ruleInertial )
                    	    {
                    	    // InternalDsl.g:367:5: (lv_inertial_5_0= ruleInertial )
                    	    // InternalDsl.g:368:6: lv_inertial_5_0= ruleInertial
                    	    {

                    	    						newCompositeNode(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_inertial_5_0=ruleInertial();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLinkRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"inertial",
                    	    							lv_inertial_5_0,
                    	    							"org.xtext.urdf.Dsl.Inertial");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDsl.g:386:3: (otherlv_6= 'visuals' ( (lv_visuals_7_0= ruleVisual ) ) ( (lv_visuals_8_0= ruleVisual ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:387:4: otherlv_6= 'visuals' ( (lv_visuals_7_0= ruleVisual ) ) ( (lv_visuals_8_0= ruleVisual ) )*
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getVisualsKeyword_4_0());
                    			
                    // InternalDsl.g:391:4: ( (lv_visuals_7_0= ruleVisual ) )
                    // InternalDsl.g:392:5: (lv_visuals_7_0= ruleVisual )
                    {
                    // InternalDsl.g:392:5: (lv_visuals_7_0= ruleVisual )
                    // InternalDsl.g:393:6: lv_visuals_7_0= ruleVisual
                    {

                    						newCompositeNode(grammarAccess.getLinkAccess().getVisualsVisualParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_visuals_7_0=ruleVisual();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkRule());
                    						}
                    						add(
                    							current,
                    							"visuals",
                    							lv_visuals_7_0,
                    							"org.xtext.urdf.Dsl.Visual");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:410:4: ( (lv_visuals_8_0= ruleVisual ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==23||LA8_0==30) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalDsl.g:411:5: (lv_visuals_8_0= ruleVisual )
                    	    {
                    	    // InternalDsl.g:411:5: (lv_visuals_8_0= ruleVisual )
                    	    // InternalDsl.g:412:6: lv_visuals_8_0= ruleVisual
                    	    {

                    	    						newCompositeNode(grammarAccess.getLinkAccess().getVisualsVisualParserRuleCall_4_2_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_visuals_8_0=ruleVisual();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLinkRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"visuals",
                    	    							lv_visuals_8_0,
                    	    							"org.xtext.urdf.Dsl.Visual");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDsl.g:430:3: (otherlv_9= 'collision' ( (lv_collision_10_0= ruleCollision ) ) ( (lv_collision_11_0= ruleCollision ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:431:4: otherlv_9= 'collision' ( (lv_collision_10_0= ruleCollision ) ) ( (lv_collision_11_0= ruleCollision ) )*
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getLinkAccess().getCollisionKeyword_5_0());
                    			
                    // InternalDsl.g:435:4: ( (lv_collision_10_0= ruleCollision ) )
                    // InternalDsl.g:436:5: (lv_collision_10_0= ruleCollision )
                    {
                    // InternalDsl.g:436:5: (lv_collision_10_0= ruleCollision )
                    // InternalDsl.g:437:6: lv_collision_10_0= ruleCollision
                    {

                    						newCompositeNode(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_collision_10_0=ruleCollision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkRule());
                    						}
                    						add(
                    							current,
                    							"collision",
                    							lv_collision_10_0,
                    							"org.xtext.urdf.Dsl.Collision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:454:4: ( (lv_collision_11_0= ruleCollision ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==31) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalDsl.g:455:5: (lv_collision_11_0= ruleCollision )
                    	    {
                    	    // InternalDsl.g:455:5: (lv_collision_11_0= ruleCollision )
                    	    // InternalDsl.g:456:6: lv_collision_11_0= ruleCollision
                    	    {

                    	    						newCompositeNode(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_collision_11_0=ruleCollision();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLinkRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"collision",
                    	    							lv_collision_11_0,
                    	    							"org.xtext.urdf.Dsl.Collision");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


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
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleJoint"
    // InternalDsl.g:478:1: entryRuleJoint returns [EObject current=null] : iv_ruleJoint= ruleJoint EOF ;
    public final EObject entryRuleJoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoint = null;


        try {
            // InternalDsl.g:478:46: (iv_ruleJoint= ruleJoint EOF )
            // InternalDsl.g:479:2: iv_ruleJoint= ruleJoint EOF
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
    // InternalDsl.g:485:1: ruleJoint returns [EObject current=null] : (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Type' ( (lv_Type_3_0= ruleJointType ) ) )? otherlv_4= 'ChildOf' ( (otherlv_5= RULE_STRING ) ) otherlv_6= 'ParentOf' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= 'limit' ( (lv_limit_9_0= ruleLimit ) ) )? (otherlv_10= 'axis' ( (lv_axis_11_0= ruleAxis ) ) )? otherlv_12= 'origin' ( (lv_origin_13_0= ruleOrigin ) ) (otherlv_14= 'callibration' ( (lv_callibration_15_0= ruleCallibration ) ) )? (otherlv_16= 'dynamics' ( (lv_dynamics_17_0= ruleDynamics ) ) )? (otherlv_18= 'mimic' ( (lv_mimic_19_0= ruleMimic ) ) )? (otherlv_20= 'safetycontroller' ( (lv_safetycontroller_21_0= ruleSafetyController ) ) )? ) ;
    public final EObject ruleJoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Enumerator lv_Type_3_0 = null;

        EObject lv_limit_9_0 = null;

        EObject lv_axis_11_0 = null;

        EObject lv_origin_13_0 = null;

        EObject lv_callibration_15_0 = null;

        EObject lv_dynamics_17_0 = null;

        EObject lv_mimic_19_0 = null;

        EObject lv_safetycontroller_21_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:491:2: ( (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Type' ( (lv_Type_3_0= ruleJointType ) ) )? otherlv_4= 'ChildOf' ( (otherlv_5= RULE_STRING ) ) otherlv_6= 'ParentOf' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= 'limit' ( (lv_limit_9_0= ruleLimit ) ) )? (otherlv_10= 'axis' ( (lv_axis_11_0= ruleAxis ) ) )? otherlv_12= 'origin' ( (lv_origin_13_0= ruleOrigin ) ) (otherlv_14= 'callibration' ( (lv_callibration_15_0= ruleCallibration ) ) )? (otherlv_16= 'dynamics' ( (lv_dynamics_17_0= ruleDynamics ) ) )? (otherlv_18= 'mimic' ( (lv_mimic_19_0= ruleMimic ) ) )? (otherlv_20= 'safetycontroller' ( (lv_safetycontroller_21_0= ruleSafetyController ) ) )? ) )
            // InternalDsl.g:492:2: (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Type' ( (lv_Type_3_0= ruleJointType ) ) )? otherlv_4= 'ChildOf' ( (otherlv_5= RULE_STRING ) ) otherlv_6= 'ParentOf' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= 'limit' ( (lv_limit_9_0= ruleLimit ) ) )? (otherlv_10= 'axis' ( (lv_axis_11_0= ruleAxis ) ) )? otherlv_12= 'origin' ( (lv_origin_13_0= ruleOrigin ) ) (otherlv_14= 'callibration' ( (lv_callibration_15_0= ruleCallibration ) ) )? (otherlv_16= 'dynamics' ( (lv_dynamics_17_0= ruleDynamics ) ) )? (otherlv_18= 'mimic' ( (lv_mimic_19_0= ruleMimic ) ) )? (otherlv_20= 'safetycontroller' ( (lv_safetycontroller_21_0= ruleSafetyController ) ) )? )
            {
            // InternalDsl.g:492:2: (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Type' ( (lv_Type_3_0= ruleJointType ) ) )? otherlv_4= 'ChildOf' ( (otherlv_5= RULE_STRING ) ) otherlv_6= 'ParentOf' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= 'limit' ( (lv_limit_9_0= ruleLimit ) ) )? (otherlv_10= 'axis' ( (lv_axis_11_0= ruleAxis ) ) )? otherlv_12= 'origin' ( (lv_origin_13_0= ruleOrigin ) ) (otherlv_14= 'callibration' ( (lv_callibration_15_0= ruleCallibration ) ) )? (otherlv_16= 'dynamics' ( (lv_dynamics_17_0= ruleDynamics ) ) )? (otherlv_18= 'mimic' ( (lv_mimic_19_0= ruleMimic ) ) )? (otherlv_20= 'safetycontroller' ( (lv_safetycontroller_21_0= ruleSafetyController ) ) )? )
            // InternalDsl.g:493:3: otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Type' ( (lv_Type_3_0= ruleJointType ) ) )? otherlv_4= 'ChildOf' ( (otherlv_5= RULE_STRING ) ) otherlv_6= 'ParentOf' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= 'limit' ( (lv_limit_9_0= ruleLimit ) ) )? (otherlv_10= 'axis' ( (lv_axis_11_0= ruleAxis ) ) )? otherlv_12= 'origin' ( (lv_origin_13_0= ruleOrigin ) ) (otherlv_14= 'callibration' ( (lv_callibration_15_0= ruleCallibration ) ) )? (otherlv_16= 'dynamics' ( (lv_dynamics_17_0= ruleDynamics ) ) )? (otherlv_18= 'mimic' ( (lv_mimic_19_0= ruleMimic ) ) )? (otherlv_20= 'safetycontroller' ( (lv_safetycontroller_21_0= ruleSafetyController ) ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getJointAccess().getJointKeyword_0());
            		
            // InternalDsl.g:497:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:498:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:498:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:499:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            // InternalDsl.g:515:3: (otherlv_2= 'Type' ( (lv_Type_3_0= ruleJointType ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:516:4: otherlv_2= 'Type' ( (lv_Type_3_0= ruleJointType ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getJointAccess().getTypeKeyword_2_0());
                    			
                    // InternalDsl.g:520:4: ( (lv_Type_3_0= ruleJointType ) )
                    // InternalDsl.g:521:5: (lv_Type_3_0= ruleJointType )
                    {
                    // InternalDsl.g:521:5: (lv_Type_3_0= ruleJointType )
                    // InternalDsl.g:522:6: lv_Type_3_0= ruleJointType
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_Type_3_0=ruleJointType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"Type",
                    							lv_Type_3_0,
                    							"org.xtext.urdf.Dsl.JointType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getJointAccess().getChildOfKeyword_3());
            		
            // InternalDsl.g:544:3: ( (otherlv_5= RULE_STRING ) )
            // InternalDsl.g:545:4: (otherlv_5= RULE_STRING )
            {
            // InternalDsl.g:545:4: (otherlv_5= RULE_STRING )
            // InternalDsl.g:546:5: otherlv_5= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(otherlv_5, grammarAccess.getJointAccess().getChildOfLinkCrossReference_4_0());
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getJointAccess().getParentOfKeyword_5());
            		
            // InternalDsl.g:561:3: ( (otherlv_7= RULE_STRING ) )
            // InternalDsl.g:562:4: (otherlv_7= RULE_STRING )
            {
            // InternalDsl.g:562:4: (otherlv_7= RULE_STRING )
            // InternalDsl.g:563:5: otherlv_7= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(otherlv_7, grammarAccess.getJointAccess().getParentOfLinkCrossReference_6_0());
            				

            }


            }

            // InternalDsl.g:574:3: (otherlv_8= 'limit' ( (lv_limit_9_0= ruleLimit ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:575:4: otherlv_8= 'limit' ( (lv_limit_9_0= ruleLimit ) )
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_20); 

                    				newLeafNode(otherlv_8, grammarAccess.getJointAccess().getLimitKeyword_7_0());
                    			
                    // InternalDsl.g:579:4: ( (lv_limit_9_0= ruleLimit ) )
                    // InternalDsl.g:580:5: (lv_limit_9_0= ruleLimit )
                    {
                    // InternalDsl.g:580:5: (lv_limit_9_0= ruleLimit )
                    // InternalDsl.g:581:6: lv_limit_9_0= ruleLimit
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_limit_9_0=ruleLimit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"limit",
                    							lv_limit_9_0,
                    							"org.xtext.urdf.Dsl.Limit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:599:3: (otherlv_10= 'axis' ( (lv_axis_11_0= ruleAxis ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:600:4: otherlv_10= 'axis' ( (lv_axis_11_0= ruleAxis ) )
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getJointAccess().getAxisKeyword_8_0());
                    			
                    // InternalDsl.g:604:4: ( (lv_axis_11_0= ruleAxis ) )
                    // InternalDsl.g:605:5: (lv_axis_11_0= ruleAxis )
                    {
                    // InternalDsl.g:605:5: (lv_axis_11_0= ruleAxis )
                    // InternalDsl.g:606:6: lv_axis_11_0= ruleAxis
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getAxisAxisParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_axis_11_0=ruleAxis();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"axis",
                    							lv_axis_11_0,
                    							"org.xtext.urdf.Dsl.Axis");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,23,FOLLOW_23); 

            			newLeafNode(otherlv_12, grammarAccess.getJointAccess().getOriginKeyword_9());
            		
            // InternalDsl.g:628:3: ( (lv_origin_13_0= ruleOrigin ) )
            // InternalDsl.g:629:4: (lv_origin_13_0= ruleOrigin )
            {
            // InternalDsl.g:629:4: (lv_origin_13_0= ruleOrigin )
            // InternalDsl.g:630:5: lv_origin_13_0= ruleOrigin
            {

            					newCompositeNode(grammarAccess.getJointAccess().getOriginOriginParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_24);
            lv_origin_13_0=ruleOrigin();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointRule());
            					}
            					set(
            						current,
            						"origin",
            						lv_origin_13_0,
            						"org.xtext.urdf.Dsl.Origin");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:647:3: (otherlv_14= 'callibration' ( (lv_callibration_15_0= ruleCallibration ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:648:4: otherlv_14= 'callibration' ( (lv_callibration_15_0= ruleCallibration ) )
                    {
                    otherlv_14=(Token)match(input,24,FOLLOW_25); 

                    				newLeafNode(otherlv_14, grammarAccess.getJointAccess().getCallibrationKeyword_11_0());
                    			
                    // InternalDsl.g:652:4: ( (lv_callibration_15_0= ruleCallibration ) )
                    // InternalDsl.g:653:5: (lv_callibration_15_0= ruleCallibration )
                    {
                    // InternalDsl.g:653:5: (lv_callibration_15_0= ruleCallibration )
                    // InternalDsl.g:654:6: lv_callibration_15_0= ruleCallibration
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getCallibrationCallibrationParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_callibration_15_0=ruleCallibration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"callibration",
                    							lv_callibration_15_0,
                    							"org.xtext.urdf.Dsl.Callibration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:672:3: (otherlv_16= 'dynamics' ( (lv_dynamics_17_0= ruleDynamics ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:673:4: otherlv_16= 'dynamics' ( (lv_dynamics_17_0= ruleDynamics ) )
                    {
                    otherlv_16=(Token)match(input,25,FOLLOW_27); 

                    				newLeafNode(otherlv_16, grammarAccess.getJointAccess().getDynamicsKeyword_12_0());
                    			
                    // InternalDsl.g:677:4: ( (lv_dynamics_17_0= ruleDynamics ) )
                    // InternalDsl.g:678:5: (lv_dynamics_17_0= ruleDynamics )
                    {
                    // InternalDsl.g:678:5: (lv_dynamics_17_0= ruleDynamics )
                    // InternalDsl.g:679:6: lv_dynamics_17_0= ruleDynamics
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getDynamicsDynamicsParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_dynamics_17_0=ruleDynamics();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"dynamics",
                    							lv_dynamics_17_0,
                    							"org.xtext.urdf.Dsl.Dynamics");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:697:3: (otherlv_18= 'mimic' ( (lv_mimic_19_0= ruleMimic ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:698:4: otherlv_18= 'mimic' ( (lv_mimic_19_0= ruleMimic ) )
                    {
                    otherlv_18=(Token)match(input,26,FOLLOW_29); 

                    				newLeafNode(otherlv_18, grammarAccess.getJointAccess().getMimicKeyword_13_0());
                    			
                    // InternalDsl.g:702:4: ( (lv_mimic_19_0= ruleMimic ) )
                    // InternalDsl.g:703:5: (lv_mimic_19_0= ruleMimic )
                    {
                    // InternalDsl.g:703:5: (lv_mimic_19_0= ruleMimic )
                    // InternalDsl.g:704:6: lv_mimic_19_0= ruleMimic
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getMimicMimicParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_mimic_19_0=ruleMimic();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"mimic",
                    							lv_mimic_19_0,
                    							"org.xtext.urdf.Dsl.Mimic");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:722:3: (otherlv_20= 'safetycontroller' ( (lv_safetycontroller_21_0= ruleSafetyController ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDsl.g:723:4: otherlv_20= 'safetycontroller' ( (lv_safetycontroller_21_0= ruleSafetyController ) )
                    {
                    otherlv_20=(Token)match(input,27,FOLLOW_31); 

                    				newLeafNode(otherlv_20, grammarAccess.getJointAccess().getSafetycontrollerKeyword_14_0());
                    			
                    // InternalDsl.g:727:4: ( (lv_safetycontroller_21_0= ruleSafetyController ) )
                    // InternalDsl.g:728:5: (lv_safetycontroller_21_0= ruleSafetyController )
                    {
                    // InternalDsl.g:728:5: (lv_safetycontroller_21_0= ruleSafetyController )
                    // InternalDsl.g:729:6: lv_safetycontroller_21_0= ruleSafetyController
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getSafetycontrollerSafetyControllerParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_safetycontroller_21_0=ruleSafetyController();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"safetycontroller",
                    							lv_safetycontroller_21_0,
                    							"org.xtext.urdf.Dsl.SafetyController");
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
    // $ANTLR end "ruleJoint"


    // $ANTLR start "entryRuleInertial"
    // InternalDsl.g:751:1: entryRuleInertial returns [EObject current=null] : iv_ruleInertial= ruleInertial EOF ;
    public final EObject entryRuleInertial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertial = null;


        try {
            // InternalDsl.g:751:49: (iv_ruleInertial= ruleInertial EOF )
            // InternalDsl.g:752:2: iv_ruleInertial= ruleInertial EOF
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
    // InternalDsl.g:758:1: ruleInertial returns [EObject current=null] : (otherlv_0= 'origin' ( (lv_origin_1_0= ruleOrigin ) ) (otherlv_2= 'mass' ( (lv_mass_3_0= ruleMass ) ) (otherlv_4= ',' ( (lv_mass_5_0= ruleMass ) ) )* )? (otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleInertia ) ) ( (lv_inertia_8_0= ruleInertia ) )* )? ) ;
    public final EObject ruleInertial() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_origin_1_0 = null;

        EObject lv_mass_3_0 = null;

        EObject lv_mass_5_0 = null;

        EObject lv_inertia_7_0 = null;

        EObject lv_inertia_8_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:764:2: ( (otherlv_0= 'origin' ( (lv_origin_1_0= ruleOrigin ) ) (otherlv_2= 'mass' ( (lv_mass_3_0= ruleMass ) ) (otherlv_4= ',' ( (lv_mass_5_0= ruleMass ) ) )* )? (otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleInertia ) ) ( (lv_inertia_8_0= ruleInertia ) )* )? ) )
            // InternalDsl.g:765:2: (otherlv_0= 'origin' ( (lv_origin_1_0= ruleOrigin ) ) (otherlv_2= 'mass' ( (lv_mass_3_0= ruleMass ) ) (otherlv_4= ',' ( (lv_mass_5_0= ruleMass ) ) )* )? (otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleInertia ) ) ( (lv_inertia_8_0= ruleInertia ) )* )? )
            {
            // InternalDsl.g:765:2: (otherlv_0= 'origin' ( (lv_origin_1_0= ruleOrigin ) ) (otherlv_2= 'mass' ( (lv_mass_3_0= ruleMass ) ) (otherlv_4= ',' ( (lv_mass_5_0= ruleMass ) ) )* )? (otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleInertia ) ) ( (lv_inertia_8_0= ruleInertia ) )* )? )
            // InternalDsl.g:766:3: otherlv_0= 'origin' ( (lv_origin_1_0= ruleOrigin ) ) (otherlv_2= 'mass' ( (lv_mass_3_0= ruleMass ) ) (otherlv_4= ',' ( (lv_mass_5_0= ruleMass ) ) )* )? (otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleInertia ) ) ( (lv_inertia_8_0= ruleInertia ) )* )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getInertialAccess().getOriginKeyword_0());
            		
            // InternalDsl.g:770:3: ( (lv_origin_1_0= ruleOrigin ) )
            // InternalDsl.g:771:4: (lv_origin_1_0= ruleOrigin )
            {
            // InternalDsl.g:771:4: (lv_origin_1_0= ruleOrigin )
            // InternalDsl.g:772:5: lv_origin_1_0= ruleOrigin
            {

            					newCompositeNode(grammarAccess.getInertialAccess().getOriginOriginParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
            lv_origin_1_0=ruleOrigin();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertialRule());
            					}
            					set(
            						current,
            						"origin",
            						lv_origin_1_0,
            						"org.xtext.urdf.Dsl.Origin");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:789:3: (otherlv_2= 'mass' ( (lv_mass_3_0= ruleMass ) ) (otherlv_4= ',' ( (lv_mass_5_0= ruleMass ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:790:4: otherlv_2= 'mass' ( (lv_mass_3_0= ruleMass ) ) (otherlv_4= ',' ( (lv_mass_5_0= ruleMass ) ) )*
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_34); 

                    				newLeafNode(otherlv_2, grammarAccess.getInertialAccess().getMassKeyword_2_0());
                    			
                    // InternalDsl.g:794:4: ( (lv_mass_3_0= ruleMass ) )
                    // InternalDsl.g:795:5: (lv_mass_3_0= ruleMass )
                    {
                    // InternalDsl.g:795:5: (lv_mass_3_0= ruleMass )
                    // InternalDsl.g:796:6: lv_mass_3_0= ruleMass
                    {

                    						newCompositeNode(grammarAccess.getInertialAccess().getMassMassParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_mass_3_0=ruleMass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInertialRule());
                    						}
                    						add(
                    							current,
                    							"mass",
                    							lv_mass_3_0,
                    							"org.xtext.urdf.Dsl.Mass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:813:4: (otherlv_4= ',' ( (lv_mass_5_0= ruleMass ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==12) ) {
                            int LA19_2 = input.LA(2);

                            if ( (LA19_2==38) ) {
                                alt19=1;
                            }


                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalDsl.g:814:5: otherlv_4= ',' ( (lv_mass_5_0= ruleMass ) )
                    	    {
                    	    otherlv_4=(Token)match(input,12,FOLLOW_34); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getInertialAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalDsl.g:818:5: ( (lv_mass_5_0= ruleMass ) )
                    	    // InternalDsl.g:819:6: (lv_mass_5_0= ruleMass )
                    	    {
                    	    // InternalDsl.g:819:6: (lv_mass_5_0= ruleMass )
                    	    // InternalDsl.g:820:7: lv_mass_5_0= ruleMass
                    	    {

                    	    							newCompositeNode(grammarAccess.getInertialAccess().getMassMassParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    lv_mass_5_0=ruleMass();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInertialRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"mass",
                    	    								lv_mass_5_0,
                    	    								"org.xtext.urdf.Dsl.Mass");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDsl.g:839:3: (otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleInertia ) ) ( (lv_inertia_8_0= ruleInertia ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:840:4: otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleInertia ) ) ( (lv_inertia_8_0= ruleInertia ) )*
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_36); 

                    				newLeafNode(otherlv_6, grammarAccess.getInertialAccess().getInertiaKeyword_3_0());
                    			
                    // InternalDsl.g:844:4: ( (lv_inertia_7_0= ruleInertia ) )
                    // InternalDsl.g:845:5: (lv_inertia_7_0= ruleInertia )
                    {
                    // InternalDsl.g:845:5: (lv_inertia_7_0= ruleInertia )
                    // InternalDsl.g:846:6: lv_inertia_7_0= ruleInertia
                    {

                    						newCompositeNode(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_inertia_7_0=ruleInertia();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInertialRule());
                    						}
                    						add(
                    							current,
                    							"inertia",
                    							lv_inertia_7_0,
                    							"org.xtext.urdf.Dsl.Inertia");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:863:4: ( (lv_inertia_8_0= ruleInertia ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==39) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalDsl.g:864:5: (lv_inertia_8_0= ruleInertia )
                    	    {
                    	    // InternalDsl.g:864:5: (lv_inertia_8_0= ruleInertia )
                    	    // InternalDsl.g:865:6: lv_inertia_8_0= ruleInertia
                    	    {

                    	    						newCompositeNode(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_37);
                    	    lv_inertia_8_0=ruleInertia();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getInertialRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"inertia",
                    	    							lv_inertia_8_0,
                    	    							"org.xtext.urdf.Dsl.Inertia");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


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


    // $ANTLR start "entryRuleVisual"
    // InternalDsl.g:887:1: entryRuleVisual returns [EObject current=null] : iv_ruleVisual= ruleVisual EOF ;
    public final EObject entryRuleVisual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisual = null;


        try {
            // InternalDsl.g:887:47: (iv_ruleVisual= ruleVisual EOF )
            // InternalDsl.g:888:2: iv_ruleVisual= ruleVisual EOF
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
    // InternalDsl.g:894:1: ruleVisual returns [EObject current=null] : ( (otherlv_0= 'material' ( (lv_material_1_0= ruleMaterial ) ) )? otherlv_2= 'origin' ( (lv_origin_3_0= ruleOrigin ) ) otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) ) ;
    public final EObject ruleVisual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_material_1_0 = null;

        EObject lv_origin_3_0 = null;

        EObject lv_geometry_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:900:2: ( ( (otherlv_0= 'material' ( (lv_material_1_0= ruleMaterial ) ) )? otherlv_2= 'origin' ( (lv_origin_3_0= ruleOrigin ) ) otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) ) )
            // InternalDsl.g:901:2: ( (otherlv_0= 'material' ( (lv_material_1_0= ruleMaterial ) ) )? otherlv_2= 'origin' ( (lv_origin_3_0= ruleOrigin ) ) otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) )
            {
            // InternalDsl.g:901:2: ( (otherlv_0= 'material' ( (lv_material_1_0= ruleMaterial ) ) )? otherlv_2= 'origin' ( (lv_origin_3_0= ruleOrigin ) ) otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) )
            // InternalDsl.g:902:3: (otherlv_0= 'material' ( (lv_material_1_0= ruleMaterial ) ) )? otherlv_2= 'origin' ( (lv_origin_3_0= ruleOrigin ) ) otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) )
            {
            // InternalDsl.g:902:3: (otherlv_0= 'material' ( (lv_material_1_0= ruleMaterial ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDsl.g:903:4: otherlv_0= 'material' ( (lv_material_1_0= ruleMaterial ) )
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_38); 

                    				newLeafNode(otherlv_0, grammarAccess.getVisualAccess().getMaterialKeyword_0_0());
                    			
                    // InternalDsl.g:907:4: ( (lv_material_1_0= ruleMaterial ) )
                    // InternalDsl.g:908:5: (lv_material_1_0= ruleMaterial )
                    {
                    // InternalDsl.g:908:5: (lv_material_1_0= ruleMaterial )
                    // InternalDsl.g:909:6: lv_material_1_0= ruleMaterial
                    {

                    						newCompositeNode(grammarAccess.getVisualAccess().getMaterialMaterialParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_material_1_0=ruleMaterial();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVisualRule());
                    						}
                    						set(
                    							current,
                    							"material",
                    							lv_material_1_0,
                    							"org.xtext.urdf.Dsl.Material");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,23,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getVisualAccess().getOriginKeyword_1());
            		
            // InternalDsl.g:931:3: ( (lv_origin_3_0= ruleOrigin ) )
            // InternalDsl.g:932:4: (lv_origin_3_0= ruleOrigin )
            {
            // InternalDsl.g:932:4: (lv_origin_3_0= ruleOrigin )
            // InternalDsl.g:933:5: lv_origin_3_0= ruleOrigin
            {

            					newCompositeNode(grammarAccess.getVisualAccess().getOriginOriginParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_origin_3_0=ruleOrigin();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVisualRule());
            					}
            					set(
            						current,
            						"origin",
            						lv_origin_3_0,
            						"org.xtext.urdf.Dsl.Origin");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_40); 

            			newLeafNode(otherlv_4, grammarAccess.getVisualAccess().getGeometryKeyword_3());
            		
            // InternalDsl.g:954:3: ( (lv_geometry_5_0= ruleGeometry ) )
            // InternalDsl.g:955:4: (lv_geometry_5_0= ruleGeometry )
            {
            // InternalDsl.g:955:4: (lv_geometry_5_0= ruleGeometry )
            // InternalDsl.g:956:5: lv_geometry_5_0= ruleGeometry
            {

            					newCompositeNode(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_geometry_5_0=ruleGeometry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVisualRule());
            					}
            					set(
            						current,
            						"geometry",
            						lv_geometry_5_0,
            						"org.xtext.urdf.Dsl.Geometry");
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
    // $ANTLR end "ruleVisual"


    // $ANTLR start "entryRuleCollision"
    // InternalDsl.g:977:1: entryRuleCollision returns [EObject current=null] : iv_ruleCollision= ruleCollision EOF ;
    public final EObject entryRuleCollision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollision = null;


        try {
            // InternalDsl.g:977:50: (iv_ruleCollision= ruleCollision EOF )
            // InternalDsl.g:978:2: iv_ruleCollision= ruleCollision EOF
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
    // InternalDsl.g:984:1: ruleCollision returns [EObject current=null] : (otherlv_0= 'geometry' ( (lv_geometry_1_0= ruleGeometry ) ) otherlv_2= 'origin' ( (lv_origin_3_0= ruleOrigin ) ) ) ;
    public final EObject ruleCollision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_geometry_1_0 = null;

        EObject lv_origin_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:990:2: ( (otherlv_0= 'geometry' ( (lv_geometry_1_0= ruleGeometry ) ) otherlv_2= 'origin' ( (lv_origin_3_0= ruleOrigin ) ) ) )
            // InternalDsl.g:991:2: (otherlv_0= 'geometry' ( (lv_geometry_1_0= ruleGeometry ) ) otherlv_2= 'origin' ( (lv_origin_3_0= ruleOrigin ) ) )
            {
            // InternalDsl.g:991:2: (otherlv_0= 'geometry' ( (lv_geometry_1_0= ruleGeometry ) ) otherlv_2= 'origin' ( (lv_origin_3_0= ruleOrigin ) ) )
            // InternalDsl.g:992:3: otherlv_0= 'geometry' ( (lv_geometry_1_0= ruleGeometry ) ) otherlv_2= 'origin' ( (lv_origin_3_0= ruleOrigin ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getCollisionAccess().getGeometryKeyword_0());
            		
            // InternalDsl.g:996:3: ( (lv_geometry_1_0= ruleGeometry ) )
            // InternalDsl.g:997:4: (lv_geometry_1_0= ruleGeometry )
            {
            // InternalDsl.g:997:4: (lv_geometry_1_0= ruleGeometry )
            // InternalDsl.g:998:5: lv_geometry_1_0= ruleGeometry
            {

            					newCompositeNode(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_geometry_1_0=ruleGeometry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollisionRule());
            					}
            					set(
            						current,
            						"geometry",
            						lv_geometry_1_0,
            						"org.xtext.urdf.Dsl.Geometry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getCollisionAccess().getOriginKeyword_2());
            		
            // InternalDsl.g:1019:3: ( (lv_origin_3_0= ruleOrigin ) )
            // InternalDsl.g:1020:4: (lv_origin_3_0= ruleOrigin )
            {
            // InternalDsl.g:1020:4: (lv_origin_3_0= ruleOrigin )
            // InternalDsl.g:1021:5: lv_origin_3_0= ruleOrigin
            {

            					newCompositeNode(grammarAccess.getCollisionAccess().getOriginOriginParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_origin_3_0=ruleOrigin();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollisionRule());
            					}
            					set(
            						current,
            						"origin",
            						lv_origin_3_0,
            						"org.xtext.urdf.Dsl.Origin");
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
    // $ANTLR end "ruleCollision"


    // $ANTLR start "entryRuleOrigin"
    // InternalDsl.g:1042:1: entryRuleOrigin returns [EObject current=null] : iv_ruleOrigin= ruleOrigin EOF ;
    public final EObject entryRuleOrigin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrigin = null;


        try {
            // InternalDsl.g:1042:47: (iv_ruleOrigin= ruleOrigin EOF )
            // InternalDsl.g:1043:2: iv_ruleOrigin= ruleOrigin EOF
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
    // InternalDsl.g:1049:1: ruleOrigin returns [EObject current=null] : ( () (otherlv_1= 'x' ( (lv_x_2_0= RULE_INT ) ) )? (otherlv_3= 'y' ( (lv_y_4_0= RULE_INT ) ) )? (otherlv_5= 'z' ( (lv_z_6_0= RULE_INT ) ) )? (otherlv_7= 'Roll' ( (lv_Roll_8_0= RULE_INT ) ) )? (otherlv_9= 'Pitch' ( (lv_Pitch_10_0= RULE_INT ) ) )? (otherlv_11= 'Yaw' ( (lv_Yaw_12_0= RULE_INT ) ) )? ) ;
    public final EObject ruleOrigin() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_x_2_0=null;
        Token otherlv_3=null;
        Token lv_y_4_0=null;
        Token otherlv_5=null;
        Token lv_z_6_0=null;
        Token otherlv_7=null;
        Token lv_Roll_8_0=null;
        Token otherlv_9=null;
        Token lv_Pitch_10_0=null;
        Token otherlv_11=null;
        Token lv_Yaw_12_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1055:2: ( ( () (otherlv_1= 'x' ( (lv_x_2_0= RULE_INT ) ) )? (otherlv_3= 'y' ( (lv_y_4_0= RULE_INT ) ) )? (otherlv_5= 'z' ( (lv_z_6_0= RULE_INT ) ) )? (otherlv_7= 'Roll' ( (lv_Roll_8_0= RULE_INT ) ) )? (otherlv_9= 'Pitch' ( (lv_Pitch_10_0= RULE_INT ) ) )? (otherlv_11= 'Yaw' ( (lv_Yaw_12_0= RULE_INT ) ) )? ) )
            // InternalDsl.g:1056:2: ( () (otherlv_1= 'x' ( (lv_x_2_0= RULE_INT ) ) )? (otherlv_3= 'y' ( (lv_y_4_0= RULE_INT ) ) )? (otherlv_5= 'z' ( (lv_z_6_0= RULE_INT ) ) )? (otherlv_7= 'Roll' ( (lv_Roll_8_0= RULE_INT ) ) )? (otherlv_9= 'Pitch' ( (lv_Pitch_10_0= RULE_INT ) ) )? (otherlv_11= 'Yaw' ( (lv_Yaw_12_0= RULE_INT ) ) )? )
            {
            // InternalDsl.g:1056:2: ( () (otherlv_1= 'x' ( (lv_x_2_0= RULE_INT ) ) )? (otherlv_3= 'y' ( (lv_y_4_0= RULE_INT ) ) )? (otherlv_5= 'z' ( (lv_z_6_0= RULE_INT ) ) )? (otherlv_7= 'Roll' ( (lv_Roll_8_0= RULE_INT ) ) )? (otherlv_9= 'Pitch' ( (lv_Pitch_10_0= RULE_INT ) ) )? (otherlv_11= 'Yaw' ( (lv_Yaw_12_0= RULE_INT ) ) )? )
            // InternalDsl.g:1057:3: () (otherlv_1= 'x' ( (lv_x_2_0= RULE_INT ) ) )? (otherlv_3= 'y' ( (lv_y_4_0= RULE_INT ) ) )? (otherlv_5= 'z' ( (lv_z_6_0= RULE_INT ) ) )? (otherlv_7= 'Roll' ( (lv_Roll_8_0= RULE_INT ) ) )? (otherlv_9= 'Pitch' ( (lv_Pitch_10_0= RULE_INT ) ) )? (otherlv_11= 'Yaw' ( (lv_Yaw_12_0= RULE_INT ) ) )?
            {
            // InternalDsl.g:1057:3: ()
            // InternalDsl.g:1058:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOriginAccess().getOriginAction_0(),
            					current);
            			

            }

            // InternalDsl.g:1064:3: (otherlv_1= 'x' ( (lv_x_2_0= RULE_INT ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:1065:4: otherlv_1= 'x' ( (lv_x_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_42); 

                    				newLeafNode(otherlv_1, grammarAccess.getOriginAccess().getXKeyword_1_0());
                    			
                    // InternalDsl.g:1069:4: ( (lv_x_2_0= RULE_INT ) )
                    // InternalDsl.g:1070:5: (lv_x_2_0= RULE_INT )
                    {
                    // InternalDsl.g:1070:5: (lv_x_2_0= RULE_INT )
                    // InternalDsl.g:1071:6: lv_x_2_0= RULE_INT
                    {
                    lv_x_2_0=(Token)match(input,RULE_INT,FOLLOW_43); 

                    						newLeafNode(lv_x_2_0, grammarAccess.getOriginAccess().getXINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOriginRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"x",
                    							lv_x_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1088:3: (otherlv_3= 'y' ( (lv_y_4_0= RULE_INT ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDsl.g:1089:4: otherlv_3= 'y' ( (lv_y_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_42); 

                    				newLeafNode(otherlv_3, grammarAccess.getOriginAccess().getYKeyword_2_0());
                    			
                    // InternalDsl.g:1093:4: ( (lv_y_4_0= RULE_INT ) )
                    // InternalDsl.g:1094:5: (lv_y_4_0= RULE_INT )
                    {
                    // InternalDsl.g:1094:5: (lv_y_4_0= RULE_INT )
                    // InternalDsl.g:1095:6: lv_y_4_0= RULE_INT
                    {
                    lv_y_4_0=(Token)match(input,RULE_INT,FOLLOW_44); 

                    						newLeafNode(lv_y_4_0, grammarAccess.getOriginAccess().getYINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOriginRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"y",
                    							lv_y_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1112:3: (otherlv_5= 'z' ( (lv_z_6_0= RULE_INT ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==34) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDsl.g:1113:4: otherlv_5= 'z' ( (lv_z_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_42); 

                    				newLeafNode(otherlv_5, grammarAccess.getOriginAccess().getZKeyword_3_0());
                    			
                    // InternalDsl.g:1117:4: ( (lv_z_6_0= RULE_INT ) )
                    // InternalDsl.g:1118:5: (lv_z_6_0= RULE_INT )
                    {
                    // InternalDsl.g:1118:5: (lv_z_6_0= RULE_INT )
                    // InternalDsl.g:1119:6: lv_z_6_0= RULE_INT
                    {
                    lv_z_6_0=(Token)match(input,RULE_INT,FOLLOW_45); 

                    						newLeafNode(lv_z_6_0, grammarAccess.getOriginAccess().getZINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOriginRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"z",
                    							lv_z_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1136:3: (otherlv_7= 'Roll' ( (lv_Roll_8_0= RULE_INT ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDsl.g:1137:4: otherlv_7= 'Roll' ( (lv_Roll_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,35,FOLLOW_42); 

                    				newLeafNode(otherlv_7, grammarAccess.getOriginAccess().getRollKeyword_4_0());
                    			
                    // InternalDsl.g:1141:4: ( (lv_Roll_8_0= RULE_INT ) )
                    // InternalDsl.g:1142:5: (lv_Roll_8_0= RULE_INT )
                    {
                    // InternalDsl.g:1142:5: (lv_Roll_8_0= RULE_INT )
                    // InternalDsl.g:1143:6: lv_Roll_8_0= RULE_INT
                    {
                    lv_Roll_8_0=(Token)match(input,RULE_INT,FOLLOW_46); 

                    						newLeafNode(lv_Roll_8_0, grammarAccess.getOriginAccess().getRollINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOriginRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Roll",
                    							lv_Roll_8_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1160:3: (otherlv_9= 'Pitch' ( (lv_Pitch_10_0= RULE_INT ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==36) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDsl.g:1161:4: otherlv_9= 'Pitch' ( (lv_Pitch_10_0= RULE_INT ) )
                    {
                    otherlv_9=(Token)match(input,36,FOLLOW_42); 

                    				newLeafNode(otherlv_9, grammarAccess.getOriginAccess().getPitchKeyword_5_0());
                    			
                    // InternalDsl.g:1165:4: ( (lv_Pitch_10_0= RULE_INT ) )
                    // InternalDsl.g:1166:5: (lv_Pitch_10_0= RULE_INT )
                    {
                    // InternalDsl.g:1166:5: (lv_Pitch_10_0= RULE_INT )
                    // InternalDsl.g:1167:6: lv_Pitch_10_0= RULE_INT
                    {
                    lv_Pitch_10_0=(Token)match(input,RULE_INT,FOLLOW_47); 

                    						newLeafNode(lv_Pitch_10_0, grammarAccess.getOriginAccess().getPitchINTTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOriginRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Pitch",
                    							lv_Pitch_10_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1184:3: (otherlv_11= 'Yaw' ( (lv_Yaw_12_0= RULE_INT ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDsl.g:1185:4: otherlv_11= 'Yaw' ( (lv_Yaw_12_0= RULE_INT ) )
                    {
                    otherlv_11=(Token)match(input,37,FOLLOW_42); 

                    				newLeafNode(otherlv_11, grammarAccess.getOriginAccess().getYawKeyword_6_0());
                    			
                    // InternalDsl.g:1189:4: ( (lv_Yaw_12_0= RULE_INT ) )
                    // InternalDsl.g:1190:5: (lv_Yaw_12_0= RULE_INT )
                    {
                    // InternalDsl.g:1190:5: (lv_Yaw_12_0= RULE_INT )
                    // InternalDsl.g:1191:6: lv_Yaw_12_0= RULE_INT
                    {
                    lv_Yaw_12_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_Yaw_12_0, grammarAccess.getOriginAccess().getYawINTTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOriginRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Yaw",
                    							lv_Yaw_12_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

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
    // InternalDsl.g:1212:1: entryRuleMass returns [EObject current=null] : iv_ruleMass= ruleMass EOF ;
    public final EObject entryRuleMass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMass = null;


        try {
            // InternalDsl.g:1212:45: (iv_ruleMass= ruleMass EOF )
            // InternalDsl.g:1213:2: iv_ruleMass= ruleMass EOF
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
    // InternalDsl.g:1219:1: ruleMass returns [EObject current=null] : ( () otherlv_1= 'Mass' ) ;
    public final EObject ruleMass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1225:2: ( ( () otherlv_1= 'Mass' ) )
            // InternalDsl.g:1226:2: ( () otherlv_1= 'Mass' )
            {
            // InternalDsl.g:1226:2: ( () otherlv_1= 'Mass' )
            // InternalDsl.g:1227:3: () otherlv_1= 'Mass'
            {
            // InternalDsl.g:1227:3: ()
            // InternalDsl.g:1228:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMassAccess().getMassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMassAccess().getMassKeyword_1());
            		

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


    // $ANTLR start "entryRuleInertia"
    // InternalDsl.g:1242:1: entryRuleInertia returns [EObject current=null] : iv_ruleInertia= ruleInertia EOF ;
    public final EObject entryRuleInertia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertia = null;


        try {
            // InternalDsl.g:1242:48: (iv_ruleInertia= ruleInertia EOF )
            // InternalDsl.g:1243:2: iv_ruleInertia= ruleInertia EOF
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
    // InternalDsl.g:1249:1: ruleInertia returns [EObject current=null] : ( () otherlv_1= 'Inertia' ) ;
    public final EObject ruleInertia() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1255:2: ( ( () otherlv_1= 'Inertia' ) )
            // InternalDsl.g:1256:2: ( () otherlv_1= 'Inertia' )
            {
            // InternalDsl.g:1256:2: ( () otherlv_1= 'Inertia' )
            // InternalDsl.g:1257:3: () otherlv_1= 'Inertia'
            {
            // InternalDsl.g:1257:3: ()
            // InternalDsl.g:1258:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInertiaAccess().getInertiaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInertiaAccess().getInertiaKeyword_1());
            		

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


    // $ANTLR start "entryRuleMaterial_Impl"
    // InternalDsl.g:1272:1: entryRuleMaterial_Impl returns [EObject current=null] : iv_ruleMaterial_Impl= ruleMaterial_Impl EOF ;
    public final EObject entryRuleMaterial_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaterial_Impl = null;


        try {
            // InternalDsl.g:1272:54: (iv_ruleMaterial_Impl= ruleMaterial_Impl EOF )
            // InternalDsl.g:1273:2: iv_ruleMaterial_Impl= ruleMaterial_Impl EOF
            {
             newCompositeNode(grammarAccess.getMaterial_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaterial_Impl=ruleMaterial_Impl();

            state._fsp--;

             current =iv_ruleMaterial_Impl; 
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
    // $ANTLR end "entryRuleMaterial_Impl"


    // $ANTLR start "ruleMaterial_Impl"
    // InternalDsl.g:1279:1: ruleMaterial_Impl returns [EObject current=null] : ( () otherlv_1= 'Material' ) ;
    public final EObject ruleMaterial_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1285:2: ( ( () otherlv_1= 'Material' ) )
            // InternalDsl.g:1286:2: ( () otherlv_1= 'Material' )
            {
            // InternalDsl.g:1286:2: ( () otherlv_1= 'Material' )
            // InternalDsl.g:1287:3: () otherlv_1= 'Material'
            {
            // InternalDsl.g:1287:3: ()
            // InternalDsl.g:1288:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMaterial_ImplAccess().getMaterialAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMaterial_ImplAccess().getMaterialKeyword_1());
            		

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
    // $ANTLR end "ruleMaterial_Impl"


    // $ANTLR start "entryRuleGeometry_Impl"
    // InternalDsl.g:1302:1: entryRuleGeometry_Impl returns [EObject current=null] : iv_ruleGeometry_Impl= ruleGeometry_Impl EOF ;
    public final EObject entryRuleGeometry_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeometry_Impl = null;


        try {
            // InternalDsl.g:1302:54: (iv_ruleGeometry_Impl= ruleGeometry_Impl EOF )
            // InternalDsl.g:1303:2: iv_ruleGeometry_Impl= ruleGeometry_Impl EOF
            {
             newCompositeNode(grammarAccess.getGeometry_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeometry_Impl=ruleGeometry_Impl();

            state._fsp--;

             current =iv_ruleGeometry_Impl; 
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
    // $ANTLR end "entryRuleGeometry_Impl"


    // $ANTLR start "ruleGeometry_Impl"
    // InternalDsl.g:1309:1: ruleGeometry_Impl returns [EObject current=null] : ( () otherlv_1= 'Geometry' ) ;
    public final EObject ruleGeometry_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1315:2: ( ( () otherlv_1= 'Geometry' ) )
            // InternalDsl.g:1316:2: ( () otherlv_1= 'Geometry' )
            {
            // InternalDsl.g:1316:2: ( () otherlv_1= 'Geometry' )
            // InternalDsl.g:1317:3: () otherlv_1= 'Geometry'
            {
            // InternalDsl.g:1317:3: ()
            // InternalDsl.g:1318:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGeometry_ImplAccess().getGeometryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getGeometry_ImplAccess().getGeometryKeyword_1());
            		

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
    // $ANTLR end "ruleGeometry_Impl"


    // $ANTLR start "entryRuleColor"
    // InternalDsl.g:1332:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalDsl.g:1332:46: (iv_ruleColor= ruleColor EOF )
            // InternalDsl.g:1333:2: iv_ruleColor= ruleColor EOF
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
    // InternalDsl.g:1339:1: ruleColor returns [EObject current=null] : ( () otherlv_1= 'Color' ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1345:2: ( ( () otherlv_1= 'Color' ) )
            // InternalDsl.g:1346:2: ( () otherlv_1= 'Color' )
            {
            // InternalDsl.g:1346:2: ( () otherlv_1= 'Color' )
            // InternalDsl.g:1347:3: () otherlv_1= 'Color'
            {
            // InternalDsl.g:1347:3: ()
            // InternalDsl.g:1348:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColorAccess().getColorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getColorAccess().getColorKeyword_1());
            		

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
    // InternalDsl.g:1362:1: entryRuleTexture returns [EObject current=null] : iv_ruleTexture= ruleTexture EOF ;
    public final EObject entryRuleTexture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTexture = null;


        try {
            // InternalDsl.g:1362:48: (iv_ruleTexture= ruleTexture EOF )
            // InternalDsl.g:1363:2: iv_ruleTexture= ruleTexture EOF
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
    // InternalDsl.g:1369:1: ruleTexture returns [EObject current=null] : ( () otherlv_1= 'Texture' ) ;
    public final EObject ruleTexture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1375:2: ( ( () otherlv_1= 'Texture' ) )
            // InternalDsl.g:1376:2: ( () otherlv_1= 'Texture' )
            {
            // InternalDsl.g:1376:2: ( () otherlv_1= 'Texture' )
            // InternalDsl.g:1377:3: () otherlv_1= 'Texture'
            {
            // InternalDsl.g:1377:3: ()
            // InternalDsl.g:1378:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTextureAccess().getTextureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTextureAccess().getTextureKeyword_1());
            		

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


    // $ANTLR start "entryRuleBox"
    // InternalDsl.g:1392:1: entryRuleBox returns [EObject current=null] : iv_ruleBox= ruleBox EOF ;
    public final EObject entryRuleBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBox = null;


        try {
            // InternalDsl.g:1392:44: (iv_ruleBox= ruleBox EOF )
            // InternalDsl.g:1393:2: iv_ruleBox= ruleBox EOF
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
    // InternalDsl.g:1399:1: ruleBox returns [EObject current=null] : ( () otherlv_1= 'Box' ) ;
    public final EObject ruleBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1405:2: ( ( () otherlv_1= 'Box' ) )
            // InternalDsl.g:1406:2: ( () otherlv_1= 'Box' )
            {
            // InternalDsl.g:1406:2: ( () otherlv_1= 'Box' )
            // InternalDsl.g:1407:3: () otherlv_1= 'Box'
            {
            // InternalDsl.g:1407:3: ()
            // InternalDsl.g:1408:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoxAccess().getBoxAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBoxAccess().getBoxKeyword_1());
            		

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
    // InternalDsl.g:1422:1: entryRuleCylinder returns [EObject current=null] : iv_ruleCylinder= ruleCylinder EOF ;
    public final EObject entryRuleCylinder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCylinder = null;


        try {
            // InternalDsl.g:1422:49: (iv_ruleCylinder= ruleCylinder EOF )
            // InternalDsl.g:1423:2: iv_ruleCylinder= ruleCylinder EOF
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
    // InternalDsl.g:1429:1: ruleCylinder returns [EObject current=null] : ( () otherlv_1= 'Cylinder' ) ;
    public final EObject ruleCylinder() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1435:2: ( ( () otherlv_1= 'Cylinder' ) )
            // InternalDsl.g:1436:2: ( () otherlv_1= 'Cylinder' )
            {
            // InternalDsl.g:1436:2: ( () otherlv_1= 'Cylinder' )
            // InternalDsl.g:1437:3: () otherlv_1= 'Cylinder'
            {
            // InternalDsl.g:1437:3: ()
            // InternalDsl.g:1438:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCylinderAccess().getCylinderAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCylinderAccess().getCylinderKeyword_1());
            		

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
    // InternalDsl.g:1452:1: entryRuleMesh returns [EObject current=null] : iv_ruleMesh= ruleMesh EOF ;
    public final EObject entryRuleMesh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMesh = null;


        try {
            // InternalDsl.g:1452:45: (iv_ruleMesh= ruleMesh EOF )
            // InternalDsl.g:1453:2: iv_ruleMesh= ruleMesh EOF
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
    // InternalDsl.g:1459:1: ruleMesh returns [EObject current=null] : ( () otherlv_1= 'Mesh' ) ;
    public final EObject ruleMesh() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1465:2: ( ( () otherlv_1= 'Mesh' ) )
            // InternalDsl.g:1466:2: ( () otherlv_1= 'Mesh' )
            {
            // InternalDsl.g:1466:2: ( () otherlv_1= 'Mesh' )
            // InternalDsl.g:1467:3: () otherlv_1= 'Mesh'
            {
            // InternalDsl.g:1467:3: ()
            // InternalDsl.g:1468:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeshAccess().getMeshAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMeshAccess().getMeshKeyword_1());
            		

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
    // InternalDsl.g:1482:1: entryRuleSphere returns [EObject current=null] : iv_ruleSphere= ruleSphere EOF ;
    public final EObject entryRuleSphere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSphere = null;


        try {
            // InternalDsl.g:1482:47: (iv_ruleSphere= ruleSphere EOF )
            // InternalDsl.g:1483:2: iv_ruleSphere= ruleSphere EOF
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
    // InternalDsl.g:1489:1: ruleSphere returns [EObject current=null] : ( () otherlv_1= 'Sphere' ) ;
    public final EObject ruleSphere() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1495:2: ( ( () otherlv_1= 'Sphere' ) )
            // InternalDsl.g:1496:2: ( () otherlv_1= 'Sphere' )
            {
            // InternalDsl.g:1496:2: ( () otherlv_1= 'Sphere' )
            // InternalDsl.g:1497:3: () otherlv_1= 'Sphere'
            {
            // InternalDsl.g:1497:3: ()
            // InternalDsl.g:1498:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSphereAccess().getSphereAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSphereAccess().getSphereKeyword_1());
            		

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


    // $ANTLR start "entryRuleLimit"
    // InternalDsl.g:1512:1: entryRuleLimit returns [EObject current=null] : iv_ruleLimit= ruleLimit EOF ;
    public final EObject entryRuleLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimit = null;


        try {
            // InternalDsl.g:1512:46: (iv_ruleLimit= ruleLimit EOF )
            // InternalDsl.g:1513:2: iv_ruleLimit= ruleLimit EOF
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
    // InternalDsl.g:1519:1: ruleLimit returns [EObject current=null] : ( () (otherlv_1= 'Lower' ( (lv_Lower_2_0= RULE_INT ) ) )? (otherlv_3= 'Upper' ( (lv_Upper_4_0= RULE_INT ) ) )? (otherlv_5= 'Effort' ( (lv_Effort_6_0= RULE_INT ) ) )? (otherlv_7= 'Velocity' ( (lv_Velocity_8_0= RULE_INT ) ) )? ) ;
    public final EObject ruleLimit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_Lower_2_0=null;
        Token otherlv_3=null;
        Token lv_Upper_4_0=null;
        Token otherlv_5=null;
        Token lv_Effort_6_0=null;
        Token otherlv_7=null;
        Token lv_Velocity_8_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1525:2: ( ( () (otherlv_1= 'Lower' ( (lv_Lower_2_0= RULE_INT ) ) )? (otherlv_3= 'Upper' ( (lv_Upper_4_0= RULE_INT ) ) )? (otherlv_5= 'Effort' ( (lv_Effort_6_0= RULE_INT ) ) )? (otherlv_7= 'Velocity' ( (lv_Velocity_8_0= RULE_INT ) ) )? ) )
            // InternalDsl.g:1526:2: ( () (otherlv_1= 'Lower' ( (lv_Lower_2_0= RULE_INT ) ) )? (otherlv_3= 'Upper' ( (lv_Upper_4_0= RULE_INT ) ) )? (otherlv_5= 'Effort' ( (lv_Effort_6_0= RULE_INT ) ) )? (otherlv_7= 'Velocity' ( (lv_Velocity_8_0= RULE_INT ) ) )? )
            {
            // InternalDsl.g:1526:2: ( () (otherlv_1= 'Lower' ( (lv_Lower_2_0= RULE_INT ) ) )? (otherlv_3= 'Upper' ( (lv_Upper_4_0= RULE_INT ) ) )? (otherlv_5= 'Effort' ( (lv_Effort_6_0= RULE_INT ) ) )? (otherlv_7= 'Velocity' ( (lv_Velocity_8_0= RULE_INT ) ) )? )
            // InternalDsl.g:1527:3: () (otherlv_1= 'Lower' ( (lv_Lower_2_0= RULE_INT ) ) )? (otherlv_3= 'Upper' ( (lv_Upper_4_0= RULE_INT ) ) )? (otherlv_5= 'Effort' ( (lv_Effort_6_0= RULE_INT ) ) )? (otherlv_7= 'Velocity' ( (lv_Velocity_8_0= RULE_INT ) ) )?
            {
            // InternalDsl.g:1527:3: ()
            // InternalDsl.g:1528:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLimitAccess().getLimitAction_0(),
            					current);
            			

            }

            // InternalDsl.g:1534:3: (otherlv_1= 'Lower' ( (lv_Lower_2_0= RULE_INT ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==48) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDsl.g:1535:4: otherlv_1= 'Lower' ( (lv_Lower_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,48,FOLLOW_42); 

                    				newLeafNode(otherlv_1, grammarAccess.getLimitAccess().getLowerKeyword_1_0());
                    			
                    // InternalDsl.g:1539:4: ( (lv_Lower_2_0= RULE_INT ) )
                    // InternalDsl.g:1540:5: (lv_Lower_2_0= RULE_INT )
                    {
                    // InternalDsl.g:1540:5: (lv_Lower_2_0= RULE_INT )
                    // InternalDsl.g:1541:6: lv_Lower_2_0= RULE_INT
                    {
                    lv_Lower_2_0=(Token)match(input,RULE_INT,FOLLOW_48); 

                    						newLeafNode(lv_Lower_2_0, grammarAccess.getLimitAccess().getLowerINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLimitRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Lower",
                    							lv_Lower_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1558:3: (otherlv_3= 'Upper' ( (lv_Upper_4_0= RULE_INT ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==49) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDsl.g:1559:4: otherlv_3= 'Upper' ( (lv_Upper_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_42); 

                    				newLeafNode(otherlv_3, grammarAccess.getLimitAccess().getUpperKeyword_2_0());
                    			
                    // InternalDsl.g:1563:4: ( (lv_Upper_4_0= RULE_INT ) )
                    // InternalDsl.g:1564:5: (lv_Upper_4_0= RULE_INT )
                    {
                    // InternalDsl.g:1564:5: (lv_Upper_4_0= RULE_INT )
                    // InternalDsl.g:1565:6: lv_Upper_4_0= RULE_INT
                    {
                    lv_Upper_4_0=(Token)match(input,RULE_INT,FOLLOW_49); 

                    						newLeafNode(lv_Upper_4_0, grammarAccess.getLimitAccess().getUpperINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLimitRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Upper",
                    							lv_Upper_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1582:3: (otherlv_5= 'Effort' ( (lv_Effort_6_0= RULE_INT ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==50) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDsl.g:1583:4: otherlv_5= 'Effort' ( (lv_Effort_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,50,FOLLOW_42); 

                    				newLeafNode(otherlv_5, grammarAccess.getLimitAccess().getEffortKeyword_3_0());
                    			
                    // InternalDsl.g:1587:4: ( (lv_Effort_6_0= RULE_INT ) )
                    // InternalDsl.g:1588:5: (lv_Effort_6_0= RULE_INT )
                    {
                    // InternalDsl.g:1588:5: (lv_Effort_6_0= RULE_INT )
                    // InternalDsl.g:1589:6: lv_Effort_6_0= RULE_INT
                    {
                    lv_Effort_6_0=(Token)match(input,RULE_INT,FOLLOW_50); 

                    						newLeafNode(lv_Effort_6_0, grammarAccess.getLimitAccess().getEffortINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLimitRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Effort",
                    							lv_Effort_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1606:3: (otherlv_7= 'Velocity' ( (lv_Velocity_8_0= RULE_INT ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==51) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDsl.g:1607:4: otherlv_7= 'Velocity' ( (lv_Velocity_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,51,FOLLOW_42); 

                    				newLeafNode(otherlv_7, grammarAccess.getLimitAccess().getVelocityKeyword_4_0());
                    			
                    // InternalDsl.g:1611:4: ( (lv_Velocity_8_0= RULE_INT ) )
                    // InternalDsl.g:1612:5: (lv_Velocity_8_0= RULE_INT )
                    {
                    // InternalDsl.g:1612:5: (lv_Velocity_8_0= RULE_INT )
                    // InternalDsl.g:1613:6: lv_Velocity_8_0= RULE_INT
                    {
                    lv_Velocity_8_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_Velocity_8_0, grammarAccess.getLimitAccess().getVelocityINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLimitRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Velocity",
                    							lv_Velocity_8_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

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
    // $ANTLR end "ruleLimit"


    // $ANTLR start "entryRuleAxis"
    // InternalDsl.g:1634:1: entryRuleAxis returns [EObject current=null] : iv_ruleAxis= ruleAxis EOF ;
    public final EObject entryRuleAxis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxis = null;


        try {
            // InternalDsl.g:1634:45: (iv_ruleAxis= ruleAxis EOF )
            // InternalDsl.g:1635:2: iv_ruleAxis= ruleAxis EOF
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
    // InternalDsl.g:1641:1: ruleAxis returns [EObject current=null] : ( () (otherlv_1= 'x' ( (lv_x_2_0= RULE_INT ) ) )? (otherlv_3= 'y' ( (lv_y_4_0= RULE_INT ) ) )? (otherlv_5= 'z' ( (lv_z_6_0= RULE_INT ) ) )? ) ;
    public final EObject ruleAxis() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_x_2_0=null;
        Token otherlv_3=null;
        Token lv_y_4_0=null;
        Token otherlv_5=null;
        Token lv_z_6_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1647:2: ( ( () (otherlv_1= 'x' ( (lv_x_2_0= RULE_INT ) ) )? (otherlv_3= 'y' ( (lv_y_4_0= RULE_INT ) ) )? (otherlv_5= 'z' ( (lv_z_6_0= RULE_INT ) ) )? ) )
            // InternalDsl.g:1648:2: ( () (otherlv_1= 'x' ( (lv_x_2_0= RULE_INT ) ) )? (otherlv_3= 'y' ( (lv_y_4_0= RULE_INT ) ) )? (otherlv_5= 'z' ( (lv_z_6_0= RULE_INT ) ) )? )
            {
            // InternalDsl.g:1648:2: ( () (otherlv_1= 'x' ( (lv_x_2_0= RULE_INT ) ) )? (otherlv_3= 'y' ( (lv_y_4_0= RULE_INT ) ) )? (otherlv_5= 'z' ( (lv_z_6_0= RULE_INT ) ) )? )
            // InternalDsl.g:1649:3: () (otherlv_1= 'x' ( (lv_x_2_0= RULE_INT ) ) )? (otherlv_3= 'y' ( (lv_y_4_0= RULE_INT ) ) )? (otherlv_5= 'z' ( (lv_z_6_0= RULE_INT ) ) )?
            {
            // InternalDsl.g:1649:3: ()
            // InternalDsl.g:1650:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAxisAccess().getAxisAction_0(),
            					current);
            			

            }

            // InternalDsl.g:1656:3: (otherlv_1= 'x' ( (lv_x_2_0= RULE_INT ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==32) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDsl.g:1657:4: otherlv_1= 'x' ( (lv_x_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_42); 

                    				newLeafNode(otherlv_1, grammarAccess.getAxisAccess().getXKeyword_1_0());
                    			
                    // InternalDsl.g:1661:4: ( (lv_x_2_0= RULE_INT ) )
                    // InternalDsl.g:1662:5: (lv_x_2_0= RULE_INT )
                    {
                    // InternalDsl.g:1662:5: (lv_x_2_0= RULE_INT )
                    // InternalDsl.g:1663:6: lv_x_2_0= RULE_INT
                    {
                    lv_x_2_0=(Token)match(input,RULE_INT,FOLLOW_51); 

                    						newLeafNode(lv_x_2_0, grammarAccess.getAxisAccess().getXINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAxisRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"x",
                    							lv_x_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1680:3: (otherlv_3= 'y' ( (lv_y_4_0= RULE_INT ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==33) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDsl.g:1681:4: otherlv_3= 'y' ( (lv_y_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_42); 

                    				newLeafNode(otherlv_3, grammarAccess.getAxisAccess().getYKeyword_2_0());
                    			
                    // InternalDsl.g:1685:4: ( (lv_y_4_0= RULE_INT ) )
                    // InternalDsl.g:1686:5: (lv_y_4_0= RULE_INT )
                    {
                    // InternalDsl.g:1686:5: (lv_y_4_0= RULE_INT )
                    // InternalDsl.g:1687:6: lv_y_4_0= RULE_INT
                    {
                    lv_y_4_0=(Token)match(input,RULE_INT,FOLLOW_52); 

                    						newLeafNode(lv_y_4_0, grammarAccess.getAxisAccess().getYINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAxisRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"y",
                    							lv_y_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1704:3: (otherlv_5= 'z' ( (lv_z_6_0= RULE_INT ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==34) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDsl.g:1705:4: otherlv_5= 'z' ( (lv_z_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_42); 

                    				newLeafNode(otherlv_5, grammarAccess.getAxisAccess().getZKeyword_3_0());
                    			
                    // InternalDsl.g:1709:4: ( (lv_z_6_0= RULE_INT ) )
                    // InternalDsl.g:1710:5: (lv_z_6_0= RULE_INT )
                    {
                    // InternalDsl.g:1710:5: (lv_z_6_0= RULE_INT )
                    // InternalDsl.g:1711:6: lv_z_6_0= RULE_INT
                    {
                    lv_z_6_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_z_6_0, grammarAccess.getAxisAccess().getZINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAxisRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"z",
                    							lv_z_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

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
    // $ANTLR end "ruleAxis"


    // $ANTLR start "entryRuleCallibration"
    // InternalDsl.g:1732:1: entryRuleCallibration returns [EObject current=null] : iv_ruleCallibration= ruleCallibration EOF ;
    public final EObject entryRuleCallibration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallibration = null;


        try {
            // InternalDsl.g:1732:53: (iv_ruleCallibration= ruleCallibration EOF )
            // InternalDsl.g:1733:2: iv_ruleCallibration= ruleCallibration EOF
            {
             newCompositeNode(grammarAccess.getCallibrationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCallibration=ruleCallibration();

            state._fsp--;

             current =iv_ruleCallibration; 
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
    // $ANTLR end "entryRuleCallibration"


    // $ANTLR start "ruleCallibration"
    // InternalDsl.g:1739:1: ruleCallibration returns [EObject current=null] : ( () (otherlv_1= 'Rising' ( (lv_Rising_2_0= RULE_STRING ) ) )? (otherlv_3= 'Falling' ( (lv_Falling_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleCallibration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_Rising_2_0=null;
        Token otherlv_3=null;
        Token lv_Falling_4_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1745:2: ( ( () (otherlv_1= 'Rising' ( (lv_Rising_2_0= RULE_STRING ) ) )? (otherlv_3= 'Falling' ( (lv_Falling_4_0= RULE_STRING ) ) )? ) )
            // InternalDsl.g:1746:2: ( () (otherlv_1= 'Rising' ( (lv_Rising_2_0= RULE_STRING ) ) )? (otherlv_3= 'Falling' ( (lv_Falling_4_0= RULE_STRING ) ) )? )
            {
            // InternalDsl.g:1746:2: ( () (otherlv_1= 'Rising' ( (lv_Rising_2_0= RULE_STRING ) ) )? (otherlv_3= 'Falling' ( (lv_Falling_4_0= RULE_STRING ) ) )? )
            // InternalDsl.g:1747:3: () (otherlv_1= 'Rising' ( (lv_Rising_2_0= RULE_STRING ) ) )? (otherlv_3= 'Falling' ( (lv_Falling_4_0= RULE_STRING ) ) )?
            {
            // InternalDsl.g:1747:3: ()
            // InternalDsl.g:1748:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCallibrationAccess().getCallibrationAction_0(),
            					current);
            			

            }

            // InternalDsl.g:1754:3: (otherlv_1= 'Rising' ( (lv_Rising_2_0= RULE_STRING ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==52) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDsl.g:1755:4: otherlv_1= 'Rising' ( (lv_Rising_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,52,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getCallibrationAccess().getRisingKeyword_1_0());
                    			
                    // InternalDsl.g:1759:4: ( (lv_Rising_2_0= RULE_STRING ) )
                    // InternalDsl.g:1760:5: (lv_Rising_2_0= RULE_STRING )
                    {
                    // InternalDsl.g:1760:5: (lv_Rising_2_0= RULE_STRING )
                    // InternalDsl.g:1761:6: lv_Rising_2_0= RULE_STRING
                    {
                    lv_Rising_2_0=(Token)match(input,RULE_STRING,FOLLOW_53); 

                    						newLeafNode(lv_Rising_2_0, grammarAccess.getCallibrationAccess().getRisingSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCallibrationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Rising",
                    							lv_Rising_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1778:3: (otherlv_3= 'Falling' ( (lv_Falling_4_0= RULE_STRING ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==53) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDsl.g:1779:4: otherlv_3= 'Falling' ( (lv_Falling_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,53,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getCallibrationAccess().getFallingKeyword_2_0());
                    			
                    // InternalDsl.g:1783:4: ( (lv_Falling_4_0= RULE_STRING ) )
                    // InternalDsl.g:1784:5: (lv_Falling_4_0= RULE_STRING )
                    {
                    // InternalDsl.g:1784:5: (lv_Falling_4_0= RULE_STRING )
                    // InternalDsl.g:1785:6: lv_Falling_4_0= RULE_STRING
                    {
                    lv_Falling_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_Falling_4_0, grammarAccess.getCallibrationAccess().getFallingSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCallibrationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Falling",
                    							lv_Falling_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

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
    // $ANTLR end "ruleCallibration"


    // $ANTLR start "entryRuleDynamics"
    // InternalDsl.g:1806:1: entryRuleDynamics returns [EObject current=null] : iv_ruleDynamics= ruleDynamics EOF ;
    public final EObject entryRuleDynamics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamics = null;


        try {
            // InternalDsl.g:1806:49: (iv_ruleDynamics= ruleDynamics EOF )
            // InternalDsl.g:1807:2: iv_ruleDynamics= ruleDynamics EOF
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
    // InternalDsl.g:1813:1: ruleDynamics returns [EObject current=null] : ( () (otherlv_1= 'Friction' ( (lv_Friction_2_0= RULE_INT ) ) )? (otherlv_3= 'Damping' ( (lv_Damping_4_0= RULE_INT ) ) )? ) ;
    public final EObject ruleDynamics() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_Friction_2_0=null;
        Token otherlv_3=null;
        Token lv_Damping_4_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1819:2: ( ( () (otherlv_1= 'Friction' ( (lv_Friction_2_0= RULE_INT ) ) )? (otherlv_3= 'Damping' ( (lv_Damping_4_0= RULE_INT ) ) )? ) )
            // InternalDsl.g:1820:2: ( () (otherlv_1= 'Friction' ( (lv_Friction_2_0= RULE_INT ) ) )? (otherlv_3= 'Damping' ( (lv_Damping_4_0= RULE_INT ) ) )? )
            {
            // InternalDsl.g:1820:2: ( () (otherlv_1= 'Friction' ( (lv_Friction_2_0= RULE_INT ) ) )? (otherlv_3= 'Damping' ( (lv_Damping_4_0= RULE_INT ) ) )? )
            // InternalDsl.g:1821:3: () (otherlv_1= 'Friction' ( (lv_Friction_2_0= RULE_INT ) ) )? (otherlv_3= 'Damping' ( (lv_Damping_4_0= RULE_INT ) ) )?
            {
            // InternalDsl.g:1821:3: ()
            // InternalDsl.g:1822:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDynamicsAccess().getDynamicsAction_0(),
            					current);
            			

            }

            // InternalDsl.g:1828:3: (otherlv_1= 'Friction' ( (lv_Friction_2_0= RULE_INT ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==54) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDsl.g:1829:4: otherlv_1= 'Friction' ( (lv_Friction_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,54,FOLLOW_42); 

                    				newLeafNode(otherlv_1, grammarAccess.getDynamicsAccess().getFrictionKeyword_1_0());
                    			
                    // InternalDsl.g:1833:4: ( (lv_Friction_2_0= RULE_INT ) )
                    // InternalDsl.g:1834:5: (lv_Friction_2_0= RULE_INT )
                    {
                    // InternalDsl.g:1834:5: (lv_Friction_2_0= RULE_INT )
                    // InternalDsl.g:1835:6: lv_Friction_2_0= RULE_INT
                    {
                    lv_Friction_2_0=(Token)match(input,RULE_INT,FOLLOW_54); 

                    						newLeafNode(lv_Friction_2_0, grammarAccess.getDynamicsAccess().getFrictionINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDynamicsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Friction",
                    							lv_Friction_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1852:3: (otherlv_3= 'Damping' ( (lv_Damping_4_0= RULE_INT ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==55) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDsl.g:1853:4: otherlv_3= 'Damping' ( (lv_Damping_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,55,FOLLOW_42); 

                    				newLeafNode(otherlv_3, grammarAccess.getDynamicsAccess().getDampingKeyword_2_0());
                    			
                    // InternalDsl.g:1857:4: ( (lv_Damping_4_0= RULE_INT ) )
                    // InternalDsl.g:1858:5: (lv_Damping_4_0= RULE_INT )
                    {
                    // InternalDsl.g:1858:5: (lv_Damping_4_0= RULE_INT )
                    // InternalDsl.g:1859:6: lv_Damping_4_0= RULE_INT
                    {
                    lv_Damping_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_Damping_4_0, grammarAccess.getDynamicsAccess().getDampingINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDynamicsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Damping",
                    							lv_Damping_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

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


    // $ANTLR start "entryRuleMimic"
    // InternalDsl.g:1880:1: entryRuleMimic returns [EObject current=null] : iv_ruleMimic= ruleMimic EOF ;
    public final EObject entryRuleMimic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMimic = null;


        try {
            // InternalDsl.g:1880:46: (iv_ruleMimic= ruleMimic EOF )
            // InternalDsl.g:1881:2: iv_ruleMimic= ruleMimic EOF
            {
             newCompositeNode(grammarAccess.getMimicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMimic=ruleMimic();

            state._fsp--;

             current =iv_ruleMimic; 
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
    // $ANTLR end "entryRuleMimic"


    // $ANTLR start "ruleMimic"
    // InternalDsl.g:1887:1: ruleMimic returns [EObject current=null] : ( () (otherlv_1= 'Joint' ( (lv_Joint_2_0= RULE_STRING ) ) )? (otherlv_3= 'Multiplier' ( (lv_Multiplier_4_0= RULE_INT ) ) )? (otherlv_5= 'OffSet' ( (lv_OffSet_6_0= RULE_INT ) ) )? ) ;
    public final EObject ruleMimic() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_Joint_2_0=null;
        Token otherlv_3=null;
        Token lv_Multiplier_4_0=null;
        Token otherlv_5=null;
        Token lv_OffSet_6_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1893:2: ( ( () (otherlv_1= 'Joint' ( (lv_Joint_2_0= RULE_STRING ) ) )? (otherlv_3= 'Multiplier' ( (lv_Multiplier_4_0= RULE_INT ) ) )? (otherlv_5= 'OffSet' ( (lv_OffSet_6_0= RULE_INT ) ) )? ) )
            // InternalDsl.g:1894:2: ( () (otherlv_1= 'Joint' ( (lv_Joint_2_0= RULE_STRING ) ) )? (otherlv_3= 'Multiplier' ( (lv_Multiplier_4_0= RULE_INT ) ) )? (otherlv_5= 'OffSet' ( (lv_OffSet_6_0= RULE_INT ) ) )? )
            {
            // InternalDsl.g:1894:2: ( () (otherlv_1= 'Joint' ( (lv_Joint_2_0= RULE_STRING ) ) )? (otherlv_3= 'Multiplier' ( (lv_Multiplier_4_0= RULE_INT ) ) )? (otherlv_5= 'OffSet' ( (lv_OffSet_6_0= RULE_INT ) ) )? )
            // InternalDsl.g:1895:3: () (otherlv_1= 'Joint' ( (lv_Joint_2_0= RULE_STRING ) ) )? (otherlv_3= 'Multiplier' ( (lv_Multiplier_4_0= RULE_INT ) ) )? (otherlv_5= 'OffSet' ( (lv_OffSet_6_0= RULE_INT ) ) )?
            {
            // InternalDsl.g:1895:3: ()
            // InternalDsl.g:1896:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMimicAccess().getMimicAction_0(),
            					current);
            			

            }

            // InternalDsl.g:1902:3: (otherlv_1= 'Joint' ( (lv_Joint_2_0= RULE_STRING ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==17) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==RULE_STRING) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // InternalDsl.g:1903:4: otherlv_1= 'Joint' ( (lv_Joint_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getMimicAccess().getJointKeyword_1_0());
                    			
                    // InternalDsl.g:1907:4: ( (lv_Joint_2_0= RULE_STRING ) )
                    // InternalDsl.g:1908:5: (lv_Joint_2_0= RULE_STRING )
                    {
                    // InternalDsl.g:1908:5: (lv_Joint_2_0= RULE_STRING )
                    // InternalDsl.g:1909:6: lv_Joint_2_0= RULE_STRING
                    {
                    lv_Joint_2_0=(Token)match(input,RULE_STRING,FOLLOW_55); 

                    						newLeafNode(lv_Joint_2_0, grammarAccess.getMimicAccess().getJointSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMimicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Joint",
                    							lv_Joint_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1926:3: (otherlv_3= 'Multiplier' ( (lv_Multiplier_4_0= RULE_INT ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==56) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDsl.g:1927:4: otherlv_3= 'Multiplier' ( (lv_Multiplier_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,56,FOLLOW_42); 

                    				newLeafNode(otherlv_3, grammarAccess.getMimicAccess().getMultiplierKeyword_2_0());
                    			
                    // InternalDsl.g:1931:4: ( (lv_Multiplier_4_0= RULE_INT ) )
                    // InternalDsl.g:1932:5: (lv_Multiplier_4_0= RULE_INT )
                    {
                    // InternalDsl.g:1932:5: (lv_Multiplier_4_0= RULE_INT )
                    // InternalDsl.g:1933:6: lv_Multiplier_4_0= RULE_INT
                    {
                    lv_Multiplier_4_0=(Token)match(input,RULE_INT,FOLLOW_56); 

                    						newLeafNode(lv_Multiplier_4_0, grammarAccess.getMimicAccess().getMultiplierINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMimicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Multiplier",
                    							lv_Multiplier_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1950:3: (otherlv_5= 'OffSet' ( (lv_OffSet_6_0= RULE_INT ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==57) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDsl.g:1951:4: otherlv_5= 'OffSet' ( (lv_OffSet_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,57,FOLLOW_42); 

                    				newLeafNode(otherlv_5, grammarAccess.getMimicAccess().getOffSetKeyword_3_0());
                    			
                    // InternalDsl.g:1955:4: ( (lv_OffSet_6_0= RULE_INT ) )
                    // InternalDsl.g:1956:5: (lv_OffSet_6_0= RULE_INT )
                    {
                    // InternalDsl.g:1956:5: (lv_OffSet_6_0= RULE_INT )
                    // InternalDsl.g:1957:6: lv_OffSet_6_0= RULE_INT
                    {
                    lv_OffSet_6_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_OffSet_6_0, grammarAccess.getMimicAccess().getOffSetINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMimicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"OffSet",
                    							lv_OffSet_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

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
    // $ANTLR end "ruleMimic"


    // $ANTLR start "entryRuleSafetyController"
    // InternalDsl.g:1978:1: entryRuleSafetyController returns [EObject current=null] : iv_ruleSafetyController= ruleSafetyController EOF ;
    public final EObject entryRuleSafetyController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSafetyController = null;


        try {
            // InternalDsl.g:1978:57: (iv_ruleSafetyController= ruleSafetyController EOF )
            // InternalDsl.g:1979:2: iv_ruleSafetyController= ruleSafetyController EOF
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
    // InternalDsl.g:1985:1: ruleSafetyController returns [EObject current=null] : ( () (otherlv_1= 'SoftLowerLimit' ( (lv_SoftLowerLimit_2_0= RULE_INT ) ) )? (otherlv_3= 'SoftUpperLimit' ( (lv_SoftUpperLimit_4_0= RULE_INT ) ) )? (otherlv_5= 'k_position' ( (lv_k_position_6_0= RULE_INT ) ) )? (otherlv_7= 'k_velocity' ( (lv_k_velocity_8_0= RULE_INT ) ) )? ) ;
    public final EObject ruleSafetyController() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_SoftLowerLimit_2_0=null;
        Token otherlv_3=null;
        Token lv_SoftUpperLimit_4_0=null;
        Token otherlv_5=null;
        Token lv_k_position_6_0=null;
        Token otherlv_7=null;
        Token lv_k_velocity_8_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1991:2: ( ( () (otherlv_1= 'SoftLowerLimit' ( (lv_SoftLowerLimit_2_0= RULE_INT ) ) )? (otherlv_3= 'SoftUpperLimit' ( (lv_SoftUpperLimit_4_0= RULE_INT ) ) )? (otherlv_5= 'k_position' ( (lv_k_position_6_0= RULE_INT ) ) )? (otherlv_7= 'k_velocity' ( (lv_k_velocity_8_0= RULE_INT ) ) )? ) )
            // InternalDsl.g:1992:2: ( () (otherlv_1= 'SoftLowerLimit' ( (lv_SoftLowerLimit_2_0= RULE_INT ) ) )? (otherlv_3= 'SoftUpperLimit' ( (lv_SoftUpperLimit_4_0= RULE_INT ) ) )? (otherlv_5= 'k_position' ( (lv_k_position_6_0= RULE_INT ) ) )? (otherlv_7= 'k_velocity' ( (lv_k_velocity_8_0= RULE_INT ) ) )? )
            {
            // InternalDsl.g:1992:2: ( () (otherlv_1= 'SoftLowerLimit' ( (lv_SoftLowerLimit_2_0= RULE_INT ) ) )? (otherlv_3= 'SoftUpperLimit' ( (lv_SoftUpperLimit_4_0= RULE_INT ) ) )? (otherlv_5= 'k_position' ( (lv_k_position_6_0= RULE_INT ) ) )? (otherlv_7= 'k_velocity' ( (lv_k_velocity_8_0= RULE_INT ) ) )? )
            // InternalDsl.g:1993:3: () (otherlv_1= 'SoftLowerLimit' ( (lv_SoftLowerLimit_2_0= RULE_INT ) ) )? (otherlv_3= 'SoftUpperLimit' ( (lv_SoftUpperLimit_4_0= RULE_INT ) ) )? (otherlv_5= 'k_position' ( (lv_k_position_6_0= RULE_INT ) ) )? (otherlv_7= 'k_velocity' ( (lv_k_velocity_8_0= RULE_INT ) ) )?
            {
            // InternalDsl.g:1993:3: ()
            // InternalDsl.g:1994:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSafetyControllerAccess().getSafetyControllerAction_0(),
            					current);
            			

            }

            // InternalDsl.g:2000:3: (otherlv_1= 'SoftLowerLimit' ( (lv_SoftLowerLimit_2_0= RULE_INT ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==58) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDsl.g:2001:4: otherlv_1= 'SoftLowerLimit' ( (lv_SoftLowerLimit_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,58,FOLLOW_42); 

                    				newLeafNode(otherlv_1, grammarAccess.getSafetyControllerAccess().getSoftLowerLimitKeyword_1_0());
                    			
                    // InternalDsl.g:2005:4: ( (lv_SoftLowerLimit_2_0= RULE_INT ) )
                    // InternalDsl.g:2006:5: (lv_SoftLowerLimit_2_0= RULE_INT )
                    {
                    // InternalDsl.g:2006:5: (lv_SoftLowerLimit_2_0= RULE_INT )
                    // InternalDsl.g:2007:6: lv_SoftLowerLimit_2_0= RULE_INT
                    {
                    lv_SoftLowerLimit_2_0=(Token)match(input,RULE_INT,FOLLOW_57); 

                    						newLeafNode(lv_SoftLowerLimit_2_0, grammarAccess.getSafetyControllerAccess().getSoftLowerLimitINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSafetyControllerRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"SoftLowerLimit",
                    							lv_SoftLowerLimit_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2024:3: (otherlv_3= 'SoftUpperLimit' ( (lv_SoftUpperLimit_4_0= RULE_INT ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==59) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDsl.g:2025:4: otherlv_3= 'SoftUpperLimit' ( (lv_SoftUpperLimit_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,59,FOLLOW_42); 

                    				newLeafNode(otherlv_3, grammarAccess.getSafetyControllerAccess().getSoftUpperLimitKeyword_2_0());
                    			
                    // InternalDsl.g:2029:4: ( (lv_SoftUpperLimit_4_0= RULE_INT ) )
                    // InternalDsl.g:2030:5: (lv_SoftUpperLimit_4_0= RULE_INT )
                    {
                    // InternalDsl.g:2030:5: (lv_SoftUpperLimit_4_0= RULE_INT )
                    // InternalDsl.g:2031:6: lv_SoftUpperLimit_4_0= RULE_INT
                    {
                    lv_SoftUpperLimit_4_0=(Token)match(input,RULE_INT,FOLLOW_58); 

                    						newLeafNode(lv_SoftUpperLimit_4_0, grammarAccess.getSafetyControllerAccess().getSoftUpperLimitINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSafetyControllerRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"SoftUpperLimit",
                    							lv_SoftUpperLimit_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2048:3: (otherlv_5= 'k_position' ( (lv_k_position_6_0= RULE_INT ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==60) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDsl.g:2049:4: otherlv_5= 'k_position' ( (lv_k_position_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,60,FOLLOW_42); 

                    				newLeafNode(otherlv_5, grammarAccess.getSafetyControllerAccess().getK_positionKeyword_3_0());
                    			
                    // InternalDsl.g:2053:4: ( (lv_k_position_6_0= RULE_INT ) )
                    // InternalDsl.g:2054:5: (lv_k_position_6_0= RULE_INT )
                    {
                    // InternalDsl.g:2054:5: (lv_k_position_6_0= RULE_INT )
                    // InternalDsl.g:2055:6: lv_k_position_6_0= RULE_INT
                    {
                    lv_k_position_6_0=(Token)match(input,RULE_INT,FOLLOW_59); 

                    						newLeafNode(lv_k_position_6_0, grammarAccess.getSafetyControllerAccess().getK_positionINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSafetyControllerRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"k_position",
                    							lv_k_position_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2072:3: (otherlv_7= 'k_velocity' ( (lv_k_velocity_8_0= RULE_INT ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==61) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDsl.g:2073:4: otherlv_7= 'k_velocity' ( (lv_k_velocity_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,61,FOLLOW_42); 

                    				newLeafNode(otherlv_7, grammarAccess.getSafetyControllerAccess().getK_velocityKeyword_4_0());
                    			
                    // InternalDsl.g:2077:4: ( (lv_k_velocity_8_0= RULE_INT ) )
                    // InternalDsl.g:2078:5: (lv_k_velocity_8_0= RULE_INT )
                    {
                    // InternalDsl.g:2078:5: (lv_k_velocity_8_0= RULE_INT )
                    // InternalDsl.g:2079:6: lv_k_velocity_8_0= RULE_INT
                    {
                    lv_k_velocity_8_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_k_velocity_8_0, grammarAccess.getSafetyControllerAccess().getK_velocityINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSafetyControllerRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"k_velocity",
                    							lv_k_velocity_8_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

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
    // $ANTLR end "ruleSafetyController"


    // $ANTLR start "ruleJointType"
    // InternalDsl.g:2100:1: ruleJointType returns [Enumerator current=null] : ( (enumLiteral_0= 'Revolute' ) | (enumLiteral_1= 'Continous' ) | (enumLiteral_2= 'Fixed' ) | (enumLiteral_3= 'Prismatic' ) ) ;
    public final Enumerator ruleJointType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDsl.g:2106:2: ( ( (enumLiteral_0= 'Revolute' ) | (enumLiteral_1= 'Continous' ) | (enumLiteral_2= 'Fixed' ) | (enumLiteral_3= 'Prismatic' ) ) )
            // InternalDsl.g:2107:2: ( (enumLiteral_0= 'Revolute' ) | (enumLiteral_1= 'Continous' ) | (enumLiteral_2= 'Fixed' ) | (enumLiteral_3= 'Prismatic' ) )
            {
            // InternalDsl.g:2107:2: ( (enumLiteral_0= 'Revolute' ) | (enumLiteral_1= 'Continous' ) | (enumLiteral_2= 'Fixed' ) | (enumLiteral_3= 'Prismatic' ) )
            int alt48=4;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt48=1;
                }
                break;
            case 63:
                {
                alt48=2;
                }
                break;
            case 64:
                {
                alt48=3;
                }
                break;
            case 65:
                {
                alt48=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalDsl.g:2108:3: (enumLiteral_0= 'Revolute' )
                    {
                    // InternalDsl.g:2108:3: (enumLiteral_0= 'Revolute' )
                    // InternalDsl.g:2109:4: enumLiteral_0= 'Revolute'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:2116:3: (enumLiteral_1= 'Continous' )
                    {
                    // InternalDsl.g:2116:3: (enumLiteral_1= 'Continous' )
                    // InternalDsl.g:2117:4: enumLiteral_1= 'Continous'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getContinousEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getJointTypeAccess().getContinousEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:2124:3: (enumLiteral_2= 'Fixed' )
                    {
                    // InternalDsl.g:2124:3: (enumLiteral_2= 'Fixed' )
                    // InternalDsl.g:2125:4: enumLiteral_2= 'Fixed'
                    {
                    enumLiteral_2=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:2132:3: (enumLiteral_3= 'Prismatic' )
                    {
                    // InternalDsl.g:2132:3: (enumLiteral_3= 'Prismatic' )
                    // InternalDsl.g:2133:4: enumLiteral_3= 'Prismatic'
                    {
                    enumLiteral_3=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_3());
                    			

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000021002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000818002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040810002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0xC000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000F000000C00000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000700800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000003F0F000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000F000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x003000000E000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00C000000C000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0300000008020000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x3C00000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000003F30000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000020001002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000D0000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000003F80000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000F20000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000003F00000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000003E00000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000003C00000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000003800000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x000E000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x3800000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x2000000000000002L});

}